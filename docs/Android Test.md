- [关于测试Android应用](https://developer.android.com/training/testing?hl=zh-cn&_gl=1*wagvie*_up*MQ..&gclid=EAIaIQobChMI3YDdiMnpjwMVsKtmAh3CmTpLEAEYASAAEgIx7PD_BwE&gclsrc=aw.ds)
- 看起来，确实，有点儿意思
- [samples](https://github.com/android/testing-samples/tree/main)，还是挺有用的，ui就是ui、runner啦、unit啦

# 基础知识

## 一、Android 应用测试基础知识

### 测试的益处

测试是应用开发流程中不可或缺的一环。通过持续对应用运行测试，您可以在公开发布应用之前验证其正确性、功能行为和易用性。

您可以浏览应用，*手动* 测试应用。您可能会使用不同的设备和模拟器、更改系统语言，并尝试**生成**每个用户错误或**遍历**每个用户流程。

不过，手动测试的可扩展性较差，并且很容易忽略应用行为中的回归。*自动化测试* 是指使用可为您执行测试的**工具**，这种方式速度更快、可重复性更高，并且通常会在开发过程的早期阶段为您提供更多有关应用的实用反馈。

### Android 中的测试类型

移动应用非常复杂，必须在多种环境中正常运行。因此，测试类型有很多种。

- 怎么听起来，像是，放屁，呢。。。。。。

#### 主题

例如，根据*主题*，测试类型各不相同：

- **功能测试**：我的应用是否能正常运行？
- **性能测试**：是否快速高效？
- **无障碍功能测试**：应用是否能与无障碍服务良好搭配使用？
- **兼容性测试**：它在每个设备和 API 级别上都能正常运行吗？

#### 范围

测试也会因*大小*或*隔离程度*而异：

- **单元测试**或**小型测试**仅验证应用的一小部分，例如方法或类。
- **端到端**测试或**大型测试**可同时验证应用的较大部分，例如整个屏幕或用户流程。
- **中型测试**介于两者之间，用于检查两个或更多单元之间的**集成**。

测试的分类方式有很多。不过，对于应用开发者来说，**最重要**的区别在于**测试的运行位置**。

### 插桩测试与本地测试

您可以在 Android 设备上或**另一台计算机**上运行测试：

- **插桩测试**：在 Android 设备（实体设备或模拟设备）上运行。**该应用**与注入命令并读取状态的**测试应用** 一起构建和安装。插桩测试通常是界面测试，会启动应用，然后与之互动。
  - 所以，是有两个应用？一个应用是当前代码执行的，东西？叫做YOU，一个应用，是来用测试它的？叫他FUCK，所以一次组成FUCK YOU。
- **本地测试**：在开发**机器**或**服务器**上执行，因此也称为*主机端测试*。它们通常很小且速度很快，可将被测对象与应用的其余部分隔离开来。

![](.\image\instru-vs-local.png)

并非所有单元测试都是本地测试，也并非所有端到端测试都在设备上运行。例如：

- **大型本地测试**：您可以使用在本地运行的 Android 模拟器，例如 [Robolectric](https://developer.android.com/training/testing/local-tests/robolectric?hl=zh-cn)。
- **小型插桩测试**：您可以验证代码是否能与框架功能（例如 SQLite 数据库）良好配合。您可以在多部设备上运行此测试，以检查与多个版本的 SQLite 的集成。
  - 搞这种，数据库的，读写，挺好、挺好

#### 示例

以下代码段演示了如何在*插桩界面测试*中与界面互动，点击某个元素并验证是否显示了另一个元素。

```kotlin
// When the Continue button is clicked
onView(withText("Continue"))
    .perform(click())

// Then the Welcome screen is displayed
onView(withText("Welcome"))
    .check(matches(isDisplayed()))
```

此代码段展示了 ViewModel（本地、主机端测试）的部分*单元测试*：

```kotlin
// Given an instance of MyViewModel
val viewModel = MyViewModel(myFakeDataRepository)

// When data is loaded
viewModel.loadData()

// Then it should be exposing data
assertTrue(viewModel.data != null)
```

### 可测试的架构

借助**可测试的应用架构**，代码遵循一种结构，让您可以轻松单独测试代码的不同部分。可测试的架构还具有其他优势，例如可读性、可维护性、可伸缩性和可重用性更强。

*无法测试*的架构会产生以下结果：

- 测试规模更大、速度更慢、不稳定程度更高。无法进行单元测试的类可能需要通过更大的集成测试或界面测试来覆盖。
- 测试不同场景的机会较少。测试范围越大，速度越慢，因此测试应用的所有可能状态可能不太现实。
  - 不知道，我们当前这个架构，是不是，不好，呢，嘿嘿嘿嘿嘿

如需详细了解架构指南，请参阅[应用架构指南](https://developer.android.com/jetpack/guide?hl=zh-cn)。

#### 解耦方法

如果您能将函数、类或模块的**一部分**从其余部分中提取出来，那么测试起来会更轻松、更有效。这种做法称为解耦，是可测试架构中最重要的概念。

常见的解耦技术包括：

- 将应用拆分为多个*层*，例如表示层、网域层和数据层。您还可以将应用拆分为多个*模块*，每个模块对应一项功能。
- 避免向具有较大依赖项（例如 activity 和 fragment）的实体添加逻辑。使用这些类作为框架的**入口点**，并将 *界面和业务逻辑* 移至其他位置，例如移至可组合项、ViewModel 或网域层。
- 避免在包含业务逻辑的类中直接使用*框架依赖项*。 例如，[请勿在 ViewModel 中使用 Android Context](https://medium.com/androiddevelopers/locale-changes-and-the-androidviewmodel-antipattern-84eb677660d9)。
  - 哼哼哼，不就是，官网，提出的，东西，神气个，JB，啊
- 使依赖项易于*替换*。例如，使用[接口](https://en.wikipedia.org/wiki/Interface_segregation_principle)而不是具体实现。即使您不使用 DI 框架，也要使用[依赖项注入](https://developer.android.com/training/dependency-injection?hl=zh-cn)。
  - 老生常谈，但是，又真的，做到了？似乎，并没有，呢。



## 二、要在 Android 中测试的内容

您应该测试的内容取决于**应用类型**、开发团队、旧版代码的数量和使用的架构等因素。以下各部分概述了新手在规划在应用中测试哪些内容时可能需要考虑的事项。

### 测试目录的组织方式

Android Studio 中的典型项目包含**两个目录**，用于存储测试的执行环境。请按照说明，在以下目录中整理测试：

- `androidTest` 目录应包含在**真实或虚拟设备上运行的测试**。此类测试包括**集成测试、端到端测试**，以及仅靠 JVM 无法验证应用功能的其他测试。
- `test` 目录应包含在本地计算机上运行的测试，如**单元测试**。与上述方法不同，这些测试可以是在**本地 JVM 上运行的测试**。

### 基本单元测试

在遵循最佳实践时，您应确保在下列情况下使用单元测试：

- 针对 **ViewModel** 或 Presenter 的**单元测试**。
- 针对**数据层**（尤其是代码库）的**单元测试**。大部分数据层都应**独立于平台**。这样做可让测试替身替换测试中的数据库模块和远程数据源。请参阅有关[在 Android 中使用测试替身](https://developer.android.com/training/testing/fundamentals/test-doubles?hl=zh-cn)的指南
- 针对其他独立于平台的层（例如**网域**层），针对用例和交互器进行**单元测试**。
- 针对**实用程序类**（例如**字符串操作和数学**）的**单元测试**。

#### 测试极端情况

单元测试应同时关注**正常情况和极端情况**。极端情况很少见，真人测试人员和大型测试不太可能发现。示例包括：

- 使用负数、零和[边界条件](https://en.wikipedia.org/wiki/Off-by-one_error)的数学运算。
- 所有可能的**网络连接错误**。
  - 这个好，把network测试测试
- 数据损坏，例如格式错误的 JSON。
  - 这个也不错，故意，写错一些数据结构，让load去调用
- 保存到文件时模拟已满存储空间。
  - 这么屌
- 在进程过程中重新创建的对象（例如旋转设备时的 activity）。
  - 这也可以？

#### 应避免的单元测试

应避免某些单元测试，因为它们的**价值较低**：

- 用于验证框架或库（而不是您的代码）能否正常运行的测试。
- *activity、fragment 或 service* 等框架入口点不应具有业务逻辑，因此不应将单元测试视为优先事项。针对 activity 的单元测试几乎没有什么价值，因为它们主要涵盖框架代码，并且需要进行更复杂的设置。**插桩测试**（如界面测试）可以涵盖这些类。

### 界面测试

您应该采用以下几种类型的界面测试：

- **屏幕界面测试**检查单个屏幕中的关键用户互动。它们可执行点击按钮、在表单中输入内容和检查可见状态等操作。不妨先为**每个屏幕创建一个测试类**。
- **用户流测试**或**导航测试**，涵盖大多数常见路径。这些测试会模拟用户完成导航流程的情况。这些是简单的测试，可用于**检查初始化过程中的运行时崩溃**。
  - 挺好的，搞下包管理那块儿东西，启动一个容器，和以activity启动
  - 哦，还有，就是那几个imagePicker、filePicker的接口，嗯，nice

> **注意** ：测试覆盖率是一项可供某些测试工具计算的指标，它表示**测试访问了多少代码内容**。它可以检测代码库中未经测试的部分，但**不应**将其用作声称具备良好测试策略的唯一指标。

### 其他测试

还有更多专门的测试，例如屏幕截图测试、性能测试和 [Monkey 测试](https://developer.android.com/studio/test/monkey?hl=zh-cn)。您还可以按用途（例如回归、无障碍功能和兼容性）对测试进行分类。

### 深入阅读

为了单独进行测试，您经常需要将受测对象的依赖项替换为虚构或模拟依赖项（通常称为“测试替身”）。请继续阅读[在 Android 中使用测试替身](https://developer.android.com/training/testing/fundamentals/test-doubles?hl=zh-cn)。

如果您想了解如何创建单元和界面测试，请参阅[测试 Codelab](https://developer.android.com/codelabs/advanced-android-kotlin-training-testing-basics?hl=zh-cn&_gl=1*14fjvcv*_up*MQ..&gclid=EAIaIQobChMI3YDdiMnpjwMVsKtmAh3CmTpLEAEYASAAEgIx7PD_BwE&gclsrc=aw.ds)。

- 这不都G了嘛，还放这里，干啥

## 三、在 Android 中使用测试替身

- 看不懂，先跳过，吧

测试元素或元素系统时，您需要*单独*进行测试。例如，如需测试 ViewModel，您无需启动模拟器并启动界面，因为它**不依赖**于（或**不应**依赖于）Android 框架。

不过，被测对象可能*依赖*其他对象才能正常运行。例如，ViewModel 可能**依赖于数据仓库**才能正常运行。

当您需要向受测对象提供依赖项时，常见做法是创建*测试替身*（或*测试对象*）。测试双是看起来和运行起来像应用中的组件，但是在测试中创建的对象，用于提供特定行为或数据。主要优点是可让您的测试更快、更简单。

## 四、测试策略

- 看不太懂，属于，比较架构层面了
- 不过，可能，早晚也是，真的要，去实现，的，呢

# 本地测试

## 一、构建本地单元测试

*本地*测试直接在您自己的**工作站**（而不是 Android 工作站）上运行 设备或模拟器因此，该方法会使用本地 Java 虚拟机 (JVM)、 而不是 Android 设备来运行测试借助本地测试 更快地处理应用逻辑不过，由于无法与 Android 框架对您可以运行的测试类型造成了限制。

单元测试会验证一小部分代码的行为， *测试*。为此，它会执行该代码并检查结果。

单元测试通常很简单，但当单元测试 *被测*在设计时未考虑可测试性：

- 不知道上面这两行，在说什么JB屌东西

### 本地测试位置

**默认**情况下，本地单元测试的源文件位于 `module-name/src/test/`。创建新的目录时，此目录已存在 使用 Android Studio 创建项目

### 添加测试依赖项

您还需要为项目配置测试依赖项，以便使用 [JUnit](https://junit.org/) 测试框架提供的标准 API。

为此，请打开应用的模块的 `build.gradle` 文件，并指定以下内容 作为依赖项您可以使用 `testImplementation` 函数来指明 它们应用于本地测试源代码集，而不是应用：

```groovy
dependencies {
  // Required -- JUnit 4 framework
  testImplementation "junit:junit:$jUnitVersion"
  // Optional -- Robolectric environment
  testImplementation "androidx.test:core:$androidXTestVersion"
  // Optional -- Mockito framework
  testImplementation "org.mockito:mockito-core:$mockitoVersion"
  // Optional -- mockito-kotlin
  testImplementation "org.mockito.kotlin:mockito-kotlin:$mockitoKotlinVersion"
  // Optional -- Mockk framework
  testImplementation "io.mockk:mockk:$mockkVersion"
}
```

> **注意** ：`testImplementation` 会为本地测试和 `androidTestImplementation` 为插桩测试添加依赖项。

- 海绵宝宝，不会就是，看到这儿添加了依赖，所以才，加上去的吧

### 创建本地单元测试类

您可以将本地单元测试类编写为 [JUnit 4](https://junit.org/junit4/) 测试类。

为此，请创建一个包含一个或多个测试方法的类，通常在 `module-name/src/test/`。测试方法以 `@Test` 注解开头， 包含的代码，用于练习和验证 资源。

以下示例演示了如何实现本地单元测试类。通过 测试方法`emailValidator_correctEmailSimple_returnsTrue()`尝试验证 `isValidEmail()`，这是应用中的方法。测试函数会返回 如果 `isValidEmail()` 也返回 true，则返回 true。

```java
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class EmailValidatorTest {
  @Test
  public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
    assertTrue(EmailValidator.isValidEmail("name@email.com"));
  }
}
```

您应创建可读的测试，用于评估 应用返回预期的结果。我们建议您使用断言库 作为 [junit.Assert](http://junit.org/javadoc/latest/org/junit/Assert.html)、[Hamcrest](https://github.com/hamcrest) 或 [Truth](https://truth.dev/)。上面的代码段示例展示了如何使用 `junit.Assert`。

### [Mockable Android 库](https://developer.android.com/training/testing/local-tests?hl=zh-cn&_gl=1*oxmpj9*_up*MQ..&gclid=EAIaIQobChMI3YDdiMnpjwMVsKtmAh3CmTpLEAEYASAAEgIx7PD_BwE&gclsrc=aw.ds#mockable-library)

- 讲道理，这个，我都没调成功过，TMMDD，明天看着试一试
- 点这个标题就好，有链接

## 二、Robolectric 策略

- 感觉，就是个SB屌东西，都不知道跑不跑得起来，垃圾

# 插装测试

- 终于，来了点，有那么一点点，用的？

## 一、构建插桩测试

插桩测试在 Android 设备上运行，无论是真机还是模拟设备。如 因此，它们可以利用 Android 框架 API插桩测试 因此能提供比本地测试更高的保真度 **慢慢来**。

- 嘿嘿嘿嘿嘿，所以啊，还是加点，这种东西，至少让人，舒服那么，一点点，吧

我们建议，只有在必须针对以下各项进行测试时使用插桩测试 真实设备的行为[AndroidX Test](https://developer.android.com/training/testing/instrumented-tests/androidx-test-libraries/test-setup?hl=zh-cn) 提供了多个库 可以在必要时**更轻松地**编写插桩测试。

> **注意** ：插桩测试（也称为插桩测试）会初始化为插桩测试， 在特殊环境中可以访问 [插桩](https://developer.android.com/reference/android/app/Instrumentation?hl=zh-cn)。此类提供对应用上下文和 用于操控被测应用并为插桩测试命名的 API。
>
> - 这东西，似乎，有点用？还是，没有用呢，谁知道，呢
> - 真JB麻烦的，喔

### 设置测试环境

在 Android Studio 项目中，您可以将用于插桩测试的源文件 测试（位于 `module-name/src/androidTest/java/` 中）。此目录已存在， 您可以创建一个新项目，其中包含一个插桩测试示例。

在开始之前，您应该添加 AndroidX Test API，以便快速 为您的应用构建和运行插桩测试代码。AndroidX Test 包含一个 JUnit 4 测试运行程序、[`AndroidJUnitRunner`](https://developer.android.com/reference/androidx/test/runner/AndroidJUnitRunner?hl=zh-cn) 和用于功能界面测试的 API 例如 [Espresso](https://developer.android.com/training/testing/espresso?hl=zh-cn)、[UI Automator](https://developer.android.com/training/testing/ui-automator?hl=zh-cn) 和 [Compose 测试](https://developer.android.com/jetpack/compose/testing?hl=zh-cn)。

您还需要为项目配置 Android 测试依赖项， 使用 AndroidX Test 提供的测试运行程序和规则 API。

在应用的**顶级** `build.gradle` 文件中，您需要指定这些库 依赖项：

您可以在 [AndroidX 版本说明](https://developer.android.com/jetpack/androidx/releases/test?hl=zh-cn)和 [Compose 中找到最新版本 界面版本说明](https://developer.android.com/reference/androidx/test/runner/AndroidJUnitRunner?hl=zh-cn)。

要使用 JUnit 4 测试类并访问测试过滤等功能， 确保将 [AndroidJUnitRunner](https://developer.android.com/reference/androidx/test/runner/AndroidJUnitRunner?hl=zh-cn) 指定为**默认测试插桩** 为项目运行程序，只需在应用的 模块级 `build.gradle` 文件：

```groovy
android {
    defaultConfig {
        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }
}
```

### 创建插桩测试类

插桩测试类**应该是** JUnit 4 测试类，该类类似于 关于如何[构建本地测试](https://developer.android.com/training/testing/unit-testing/local-unit-tests?hl=zh-cn#build)的部分中介绍的类。

如需创建 JUnit 4 插桩测试类，请将 `AndroidJUnit4` 指定为 **默认测试运行程序**。

> **注意** ：如果您的测试套件依赖于 JUnit3 和 JUnit4 库的混合搭配，请将 测试开头的 `@RunWith(AndroidJUnit4::class)` 注解 类定义。

以下示例展示了如何编写插桩测试来验证 [Parcelable](https://developer.android.com/reference/android/os/Parcelable?hl=zh-cn) 接口已针对 `LogHistory` 类：

```java
import android.os.Parcel;
import android.util.Pair;
import androidx.test.runner.AndroidJUnit4;
import com.google.common.truth.Truth.assertThat;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

// @RunWith is required only if you use a mix of JUnit3 and JUnit4.
@RunWith(AndroidJUnit4.class)
public class LogHistoryAndroidUnitTest {

    public static final String TEST_STRING = "This is a string";
    public static final long TEST_LONG = 12345678L;
    private LogHistory mLogHistory;

    @Before
    public void createLogHistory() {
        mLogHistory = new LogHistory();
    }

    @Test
    public void logHistory_ParcelableWriteRead() {
        // Set up the Parcelable object to send and receive.
        mLogHistory.addEntry(TEST_STRING, TEST_LONG);

        // Write the data.
        Parcel parcel = Parcel.obtain();
        mLogHistory.writeToParcel(parcel, mLogHistory.describeContents());

        // After you're done with writing, you need to reset the parcel for reading.
        parcel.setDataPosition(0);

        // Read the data.
        LogHistory createdFromParcel = LogHistory.CREATOR.createFromParcel(parcel);
        List<Pair<String, Long>> createdFromParcelData
                = createdFromParcel.getData();

        // Verify that the received data is correct.
        assertThat(createdFromParcelData.size()).isEqualTo(1);
        assertThat(createdFromParcelData.get(0).first).isEqualTo(TEST_STRING);
        assertThat(createdFromParcelData.get(0).second).isEqaulTo(TEST_LONG);
        // 这个assertThat，看起来，有点意思
    }
}
```

### 运行插桩测试

插桩测试可以在真实设备或模拟器上运行。在 Android 中 通过 Studio 指南，您可以了解如何：

- [在 Android Studio 中测试](https://developer.android.com/studio/test?hl=zh-cn)
- [从命令行进行测试](https://developer.android.com/studio/test/command-line?hl=zh-cn)

### 其他资源

**界面测试**通常是插桩测试，用于验证 界面它们使用 **Espresso** 或 **Compose Test** 等框架。学习内容 请阅读[界面测试指南](https://developer.android.com/training/testing/ui-tests?hl=zh-cn)。

如需详细了解如何使用插桩测试，请参阅 资源。

#### 示例

- [插桩单元测试代码示例](https://github.com/android/testing-samples/tree/main/unit/BasicUnitAndroidTest)

#### Codelab

- [Android 测试 Codelab](https://developer.android.com/codelabs/advanced-android-kotlin-training-testing-basics?hl=zh-cn)

## 二、大规模测试稳定性

- 在讲什么？呢？

## 三、性能测试

- 测NMB哦

## 四、AndroidX 测试库

- 看起来，稍微，有点用处？

### 针对 AndroidX Test 设置项目

- 在说什么？

### AndroidX Test 的 JUnit4 规则

- 在说什么？

### AndroidJUnitRunner

- 似乎，稍微有一点点用处了

[`AndroidJUnitRunner`](https://developer.android.com/reference/androidx/test/runner/AndroidJUnitRunner?hl=zh-cn) 类是一个 [JUnit](http://junit.org/junit4/) 测试运行程序，可让您在 Android 设备上运行插桩 [JUnit 4](https://junit.org/junit4/) 测试，包括使用 [Espresso](https://developer.android.com/training/testing/espresso?hl=zh-cn)、[UI Automator](https://developer.android.com/training/testing/ui-automator?hl=zh-cn) 和 [Compose](https://developer.android.com/jetpack/compose/testing?hl=zh-cn) 测试框架的测试。

此测试运行程序负责将测试软件包和被测应用加载到设备上，运行测试并报告测试结果。

此测试运行程序支持几项常见的测试任务，包括以下各项：

- [编写 JUnit 测试](https://developer.android.com/training/testing/instrumented-tests/androidx-test-libraries/runner?hl=zh-cn&_gl=1*1g63nzw*_up*MQ..&gclid=EAIaIQobChMI3YDdiMnpjwMVsKtmAh3CmTpLEAEYASAAEgIx7PD_BwE&gclsrc=aw.ds#write-junit)
- [访问应用的上下文](https://developer.android.com/training/testing/instrumented-tests/androidx-test-libraries/runner?hl=zh-cn&_gl=1*1g63nzw*_up*MQ..&gclid=EAIaIQobChMI3YDdiMnpjwMVsKtmAh3CmTpLEAEYASAAEgIx7PD_BwE&gclsrc=aw.ds#access-context)
- [过滤测试](https://developer.android.com/training/testing/instrumented-tests/androidx-test-libraries/runner?hl=zh-cn&_gl=1*1g63nzw*_up*MQ..&gclid=EAIaIQobChMI3YDdiMnpjwMVsKtmAh3CmTpLEAEYASAAEgIx7PD_BwE&gclsrc=aw.ds#filter-tests)
- [将测试分片](https://developer.android.com/training/testing/instrumented-tests/androidx-test-libraries/runner?hl=zh-cn&_gl=1*1g63nzw*_up*MQ..&gclid=EAIaIQobChMI3YDdiMnpjwMVsKtmAh3CmTpLEAEYASAAEgIx7PD_BwE&gclsrc=aw.ds#shard-tests)

#### 访问应用的上下文

- 感觉其他几个，有个JB屌用？？？

使用 `AndroidJUnitRunner` 运行测试时，您可以通过调用静态 `ApplicationProvider.getApplicationContext()` 方法来访问被测应用的上下文。如果您已在应用中创建了 `Application` 的自定义子类，则此方法会返回自定义子类的上下文。

- 真JB有用，呢。

如果您是工具实现者，则可以使用 [`InstrumentationRegistry`](https://developer.android.com/reference/androidx/test/InstrumentationRegistry?hl=zh-cn) 类访问**低级测试 API**。此类包含 [`Instrumentation`](https://developer.android.com/reference/android/app/Instrumentation?hl=zh-cn) 对象、目标应用 [`Context`](https://developer.android.com/reference/android/content/Context?hl=zh-cn) 对象、测试应用 `Context` 对象以及传入测试的命令行参数。

- 还能实现工具？

#### 更多信息

如需详细了解如何使用 AndroidJUnitRunner，请参阅 [API 参考文档](https://developer.android.com/reference/androidx/test/runner/package-summary?hl=zh-cn&_gl=1*1fbay2p*_up*MQ..&gclid=EAIaIQobChMI3YDdiMnpjwMVsKtmAh3CmTpLEAEYASAAEgIx7PD_BwE&gclsrc=aw.ds)。

#### 其他资源

如需详细了解如何使用 `AndroidJUnitRunner`，请参阅以下资源。

#### 示例

- [AndroidJunitRunnerSample](https://github.com/android/testing-samples/tree/main/runner/AndroidJunitRunnerSample)：展示测试注解、参数化测试和测试套件的创建。

# 界面测试

- 这么高级的？

## 一、概览

- 不知道在讲什么

## 二、行为界面测试

- 基本上，就是在讲，要调用**[Espresso 测试框架](https://developer.android.com/training/testing/espresso?hl=zh-cn)**

## 三、界面截图测试

- 彻底没看，赶紧跳过

# 持续集成

## 一、基本信息

- 好像就是，先跑下流水线，构建一下的，那种感觉

## 二、自动化操作类型

- 不知道，在讲什么

## 三、常见功能

- 不知道，在讲什么

# Espresso

## 一、[Espresso](https://developer.android.com/training/testing/espresso?hl=zh-cn&_gl=1*137fubn*_up*MQ..&gclid=EAIaIQobChMI3YDdiMnpjwMVsKtmAh3CmTpLEAEYASAAEgIx7PD_BwE&gclsrc=aw.ds)

您可以使用 Espresso 来编写简洁、美观且可靠的 Android **界面测试**。

以下代码段展示了 Espresso 测试的一个示例：

```java
@Test
public void greeterSaysHello() {
    onView(withId(R.id.name_field)).perform(typeText("Steve"));
    onView(withId(R.id.greet_button)).perform(click());
    onView(withText("Hello Steve!")).check(matches(isDisplayed()));
}
```

核心 API 小巧、可预测、易于学习，并且对 自定义。Espresso 测试会说明预期、交互和断言 而不受样板内容、自定义基础架构、 或杂乱的实施细节造成障碍。

Espresso 测试运行速度极快！它让您远离等待、同步、睡眠、 并在应用上操作和断言时 静态数据。

- 讲什么MBD废话呢

### 目标受众群体

Espresso 面向那些认为自动化测试 开发生命周期不可或缺的一部分。虽然它可用于黑盒 熟悉测试工具的人员可以解锁 Espresso 的全部能力 受测代码库

### 同步功能

每次测试调用 [`onView()`](https://developer.android.com/reference/androidx/test/espresso/Espresso?hl=zh-cn#onView(org.hamcrest.Matcher))、 Espresso 会**等待执行**相应的界面操作或断言， 满足以下同步条件：

- 消息队列中没有 Espresso 立即需要的任何**消息 过程**。
- 没有当前正在执行的“`AsyncTask`”实例 任务。
- 开发者定义的所有 [空闲资源](https://developer.android.com/training/testing/espresso/idling-resource?hl=zh-cn)处于空闲状态。

通过执行这些检查，Espresso 可显著提高 在任何给定时间都只能发生一项界面操作或断言。此功能 为您提供更可靠、更可靠的测试结果。

### 软件包

- `espresso-core` - 包含核心和基本的 `View` 匹配器、操作和 断言。请参阅 [基本信息](https://developer.android.com/training/testing/espresso/basics?hl=zh-cn) 和[食谱](https://developer.android.com/training/testing/espresso/recipes?hl=zh-cn)。
- [`espresso-web`](https://developer.android.com/training/testing/espresso/web?hl=zh-cn) - 包含 `WebView` 支持的资源。
- [`espresso-idling-resource`](https://developer.android.com/training/testing/espresso/idling-resource?hl=zh-cn) - Espresso 与后台作业同步的机制。
- `espresso-contrib` - 包含 `DatePicker` 的外部贡献， `RecyclerView` 和 `Drawer` 操作、无障碍功能检查以及 `CountingIdlingResource`。
- [`espresso-intents`](https://developer.android.com/training/testing/espresso/intents?hl=zh-cn) - 用于对封闭测试的 intent 进行验证和打桩的扩展。
- `espresso-remote` - Espresso 的[多进程](https://developer.android.com/training/testing/espresso/multiprocess?hl=zh-cn)功能的位置。

如需详细了解最新版本，请参阅 [版本说明](https://developer.android.com/topic/libraries/testing-support-library/release-notes?hl=zh-cn)。

### 其他资源

如需详细了解如何在 Android 测试中使用 Espresso，请查阅 以下资源。

### 示例

- [Espresso 代码示例](https://github.com/googlesamples/android-testing) 包括各种 Espresso 示例。
- [BasicSample](https://github.com/android/testing-samples/tree/main/ui/espresso/BasicSample)： 基本的 Espresso 示例。
- [（更多…）](https://developer.android.com/training/testing/espresso/additional-resources?hl=zh-cn#samples)

## 二、[Espresso 基础知识](https://developer.android.com/training/testing/espresso/basics?hl=zh-cn&_gl=1*137fubn*_up*MQ..&gclid=EAIaIQobChMI3YDdiMnpjwMVsKtmAh3CmTpLEAEYASAAEgIx7PD_BwE&gclsrc=aw.ds)

本文档将介绍如何使用 Espresso API。

- 什么的屌东西，看不懂，看不懂

=================================================================

感觉，基本上，也就，看到这么些东西了

几乎，还是不知道，怎么搞，看看示例，吧

然后洗澡，看 离散数学 去了
