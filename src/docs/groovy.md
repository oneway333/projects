# Groovy 可选

Groovy是一个“**可选**”类型的语言，当理解语言的基本原理时，这种区别是一个**重要的语言**。与Java相比，Java是一种“强”类型的语言，由此**编译器**知道每个变量的所有类型，并且可以在编译时**理解和尊重协议**。这意味着方法调用能够在**编译时确定**。

- NMD，机翻能不能用心一点点，呀

当在Groovy中编写代码时，开发人员可以灵活地提供动态类型或不是静态类型。这可以提供一些简单的实现，并且当正确利用时，可以以强大和**动态**的方式为您的应用程序提供服务。

在Groovy中，可选的键入是通过 ***def*** 关键字完成的。下面是一个使用def方法的例子 -

```groovy
class Example { 
   static void main(String[] args) { 
      // Example of an Integer using def 
      def a = 100; 
      println(a); 
		
      // Example of an float using def 
      def b = 100.10; 
      println(b); 
		
      // Example of an Double using def 
      def c = 100.101; 
      println(c);
		
      // Example of an String using def 
      def d = "HelloWorld"; 
      println(d); 
   } 
} 
```

从上面的程序，我们可以看到，我们没有声明单个变量为Integer，float，double或string，即使它们包含这些类型的值。

当我们运行上面的程序，我们将得到以下结果 -

```powershell
100 
100.10 
100.101
HelloWorld
```

可选的类型在开发期间可以是一个强大的实用程序，但是当代码变得**太大和复杂时**，可能导致在后期开发阶段的可维护性问题。

要了解如何使用Groovy中的可选输入，而不让代码库陷入无法维护的混乱，最好在应用程序中采用“**鸭式输入**”的理念。

- 嗯，看起来，挺好的，吧？

如果我们使用鸭式重写上面的代码，它将看起来像下面给出的。变量名称的名称比它们代表的类型更多，这使得代码更容易理解。

```groovy
class Example { 
   static void main(String[] args) { 
      // Example of an Integer using def 
      def aint = 100; 
      println(aint); 
		
      // Example of an float using def 
      def bfloat = 100.10; 
      println(bfloat); 
		
      // Example of an Double using def 
      def cDouble = 100.101; 
      println(cDouble);
		
      // Example of an String using def 
      def dString = "HelloWorld"; 
      println(dString); 
   } 
}
```

# Groovy 数字

在 Groovy 中，数字**实际上表示为对象**，它们**都是**类 Integer 的一个实例。要使对象做某事，我们需要调用在其**类中声明的一个方法**。

Groovy 支持整数和浮点数。

- 整数是不包含分数的值。
- 浮点数是包含小数部分的十进制值。

Groovy 中的数字示例如下所示 -

```groovy
Integer x = 5; 
Float y = 1.25; 
```

其中 x 是整数类型，y 是浮点数。

Groovy 中的数字被定义为对象的原因通常是因为存在对数字执行操作的要求。在原始类型上提供类的概念被称为包装类。

默认情况下，Groovy 中提供了以下包装程序类。

![](.\images\number_wrapper_classes.jpg)

包装类的对象包含或包装其各自的基本数据类型。将原始数据类型转换为对象的过程称为装箱，这由编译器负责。将对象转换回其对应的基本类型的过程称为取消装箱。

## 例子

以下是装箱和拆箱的例子 

```groovy
class Example { 
   static void main(String[] args) {
      Integer x = 5,y = 10,z = 0; 
		
      // The the values of 5,10 and 0 are boxed into Integer types 
      // The values of x and y are unboxed and the addition is performed 
      z = x+y; 
      println(z);
   }
}
```

上述程序的输出将为 15.在上述示例中，5,10 和 0 的值相应地首先嵌入到整数变量 x，y 和 z 中。上述程序的输出将是15。然后，当执行 x 和 y 的添加时，值从其整数类型取消装箱。

## 数字方法

由于 Groovy 中的 Numbers 表示为类，以下是可用的方法列表。

| 序号 |                          方法和描述                          |
| :--- | :----------------------------------------------------------: |
| 1    | [xxxValue（）](https://www.w3cschool.cn/groovy/groovy_xxxvalue.html)此方法接受 Number 作为参数，并基于调用的方法返回基本类型。 |
| 2    | [compareTo()](https://www.w3cschool.cn/groovy/groovy_compareto.html)compareTo 方法是使用比较一个数字与另一个数字。如果要比较数字的值，这是有用的。 |
| 3    | [equals()](https://www.w3cschool.cn/groovy/groovy_equals.html)该方法确定调用方法的 Number 对象是否等于作为参数传递的对象。 |
| 4    | [valueOf()](https://www.w3cschool.cn/groovy/groovy_valueof.html)valueOf 方法返回保存所传递的参数的值的相关 Number 对象。 |
| 5    | [toString()](https://www.w3cschool.cn/groovy/groovy_tostring.html)该方法用于获取表示 Number 对象的值的 String 对象。 |
| 6    | [parseInt()](https://www.w3cschool.cn/groovy/groovy_parseint.html)此方法用于获取某个 String 的原始数据类型。 parseXxx（）是一个静态方法，可以有一个参数或两个参数。 |
| 7    | [abs()](https://www.w3cschool.cn/groovy/groovy_abs.html)该方法给出了参数的绝对值。参数可以是 int，float，long，double，short，byte。 |
| 8    | [ceil()](https://www.w3cschool.cn/groovy/groovy_ceil.html)方法 ceil 给出大于或等于参数的最小整数。 |
| 9    | [floor()](https://www.w3cschool.cn/groovy/groovy_floor.html)方法 floor 给出小于或等于参数的最大整数。 |
| 10   | [rint()](https://www.w3cschool.cn/groovy/groovy_rint.html)方法 rint 返回值最接近参数的整数。 |
| 11   | [round()](https://www.w3cschool.cn/groovy/groovy_round.html)方法 round 返回最接近的 long 或 int，由方法返回类型给出。 |
| 12   | [min()](https://www.w3cschool.cn/groovy/groovy_min.html)该方法给出两个参数中较小的一个。参数可以是 int，float，long，double。 |
| 13   | [max()](https://www.w3cschool.cn/groovy/groovy_max.html)该方法给出了两个参数的最大值。参数可以是 int，float，long，double。 |
| 14   | [exp()](https://www.w3cschool.cn/groovy/groovy_exp.html)该方法返回自然对数e的底数为参数的幂。 |
| 15   | [log()](https://www.w3cschool.cn/groovy/groovy_log.html)该方法返回参数的自然对数。 |
| 16   | [pow()](https://www.w3cschool.cn/groovy/groovy_pow.html)该方法返回第一个参数的值增加到第二个参数的幂。 |
| 17   | [sqrt()](https://www.w3cschool.cn/groovy/groovy_sqrt.html)该方法返回参数的平方根。 |
| 18   | [sin()](https://www.w3cschool.cn/groovy/groovy_sin.html)该方法返回指定 double 值的正弦值。 |
| 19   | [cos()](https://www.w3cschool.cn/groovy/groovy_cos.html)该方法返回指定 double 值的余弦值。 |
| 20   | [tan()](https://www.w3cschool.cn/groovy/groovy_tan.html)该方法返回指定 double 值的正切值。 |
| 21   | [asin()](https://www.w3cschool.cn/groovy/groovy_asin.html)该方法返回指定 double 值的反正弦值。 |
| 22   | [acos()](https://www.w3cschool.cn/groovy/groovy_acos.html)该方法返回指定 double 值的反余弦值。 |
| 23   | [atan()](https://www.w3cschool.cn/groovy/groovy_atan.html)该方法返回指定 double 值的反正切。 |
| 24   | [atan2()](https://www.w3cschool.cn/groovy/groovy_atan2.html)该方法将直角坐标（x，y）转换为极坐标（r，theta），并返回theta。 |
| 25   | [toDegrees()](https://www.w3cschool.cn/groovy/groovy_numbers_parseint.html)该方法将参数值转换为度。 |
| 26   | [toRadians](https://www.w3cschool.cn/groovy/groovy_radian.html)[()](https://www.w3cschool.cn/groovy/groovy_radian.html) 该方法将参数值转换为弧度。 |
| 27   | [random()](https://www.w3cschool.cn/groovy/groovy_random.html)该方法用于生成介于0.0和1.0之间的随机数。范围是：0.0 = <Math.random <1.0。通过使用算术可以实现不同的范围。 |

# Groovy 字符串

reverse通过在引号中包含字符串文本，在Groovy中构造一个字符串文字。

Groovy提供了多种表示String字面量的方法。 Groovy中的字符串可以用单引号（'），双引号（“）或**三引号**（”“”）括起来。此外，由三重引号括起来的Groovy字符串可以跨越多行。

以下是Groovy中字符串使用的示例 -

```groovy
class Example { 
   static void main(String[] args) { 
      String a = 'Hello Single'; 
      String b = "Hello Double"; 
      String c = "'Hello Triple" + "Multiple lines'";
		
      println(a); 
      println(b); 
      println(c); 
   } 
}
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
Hello Single 
Hello Double 
'Hello TripleMultiple lines'
```

## 一、字符串索引

Groovy中的字符串是**字符的有序序列**。字符串中的单个字符可以通过其位置访问。这由索引位置给出。

字符串索引从零开始，以小于字符串长度的一个结束。 Groovy还允许**负索引**从字符串的末尾开始计数。

以下是Groovy中字符串索引的使用示例 -

```groovy
class Example { 
   static void main(String[] args) { 
      String sample = "Hello world"; 
      println(sample[4]); // Print the 5 character in the string
		
      //Print the 1st character in the string starting from the back 
      println(sample[-1]); 
      println(sample[1..2]);//Prints a string starting from Index 1 to 2 
      println(sample[4..2]);//Prints a string starting from Index 4 back to 2 
      
   } 
}
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
o 
d 
el 
oll 
```

## 二、基本字符串操作

首先让我们学习groovy中的基本字符串操作。它们在下面给出。

| 序号 |                       字符串操作和描述                       |
| :--- | :----------------------------------------------------------: |
| 1    | [Concatenation of two strings](https://www.w3cschool.cn/groovy/groovy_concatenation_of_two_strings.html)字符串的串联可以通过简单的'+'运算符来完成。 |
| 2    | [String Repetition](https://www.w3cschool.cn/groovy/groovy_string_repetition.html)字符串的**重复**可以通过简单的'*'运算符完成。 |
| 3    | [String Length](https://www.w3cschool.cn/groovy/groovy_string_length.html)由字符串的length（）方法确定的字符串的长度。 |

## 三、字符串方法

这里是String类支持的方法列表。

| 序号 |                          方法和描述                          |
| :--- | :----------------------------------------------------------: |
| 1    | [center()](https://www.w3cschool.cn/groovy/groovy_center.html)返回一个新的长度为numberOfChars的字符串，该字符串由左侧和右侧用空格字符填充的收件人组成。 |
| 2    | [compareToIgnoreCase()](https://www.w3cschool.cn/groovy/groovy_comparetoignorecase.html)按字母顺序**比较**两个字符串，忽略大小写差异。 |
| 3    | [concat()](https://www.w3cschool.cn/groovy/groovy_concat.html)将指定的String连接到此String的结尾。 |
| 4    | [eachMatch()](https://www.w3cschool.cn/groovy/groovy_eachmatch.html)处理每个正则表达式组（参见下一节）匹配的给定String的子字符串。 |
| 5    | [endsWith()](https://www.w3cschool.cn/groovy/groovy_endswith.html)测试此字符串是否以指定的后缀结尾。 |
| 6    | [equalsIgnoreCase()](https://www.w3cschool.cn/groovy/groovy_equalsignorecase.html)将此字符串与另一个字符串进行比较，忽略大小写注意事项。 |
| 7    | [getAt()](https://www.w3cschool.cn/groovy/groovy_getat.html)它在索引位置返回字符串值 |
| 8    | [indexOf()](https://www.w3cschool.cn/groovy/groovy_indexof.html)返回此字符串中指定子字符串第一次出现的索引。 |
| 9    | [matches()](https://www.w3cschool.cn/groovy/groovy_matches.html)它输出字符串是否匹配给定的正则表达式。 |
| 10   | [minus()](https://www.w3cschool.cn/groovy/groovy_minus.html)**删除**字符串的值部分。 |
| 11   | [next()](https://www.w3cschool.cn/groovy/groovy_next.html)此方法由++运算符为String类调用。它增加给定字符串中的最后一个字符。 |
| 12   | [padLeft（）](https://www.w3cschool.cn/groovy/groovy_padleft.html)填充字符串，并在左边附加空格。 |
| 13   | [padRight()](https://www.w3cschool.cn/groovy/groovy_padright.html)填充字符串，并在右边附加空格。 |
| 14   | [plus()](https://www.w3cschool.cn/groovy/groovy_plus.html)追加字符串 |
| 15   | [previous()](https://www.w3cschool.cn/groovy/groovy_previous.html)此方法由CharSequence的 - 运算符调用。 |
| 16   | [replaceAll（）](https://www.w3cschool.cn/groovy/groovy_replaceall.html)通过对该文本的关闭结果替换捕获的组的所有出现。 |
| 17   | [reverse()](https://www.w3cschool.cn/groovy/groovy_reverse.html)创建一个与此String相反的新字符串。 |
| 18   | [split()](https://www.w3cschool.cn/groovy/groovy_split.html)将此String拆分为给定正则表达式的匹配项。 |
| 19   | [subString()](https://www.w3cschool.cn/groovy/groovy_substring.html)返回一个新的String，它是此String的子字符串。 |
| 20   | [toUpperCase()](https://www.w3cschool.cn/groovy/groovy_touppercase.html)将此字符串中的所有字符转换为大写。 |
| 21   | [toLowerCase()](https://www.w3cschool.cn/groovy/groovy_tolowercase.html)将此字符串中的所有字符转换为小写。 |

# Groovy 范围

范围是指定值序列的**速记**。范围由序列中的**第一个**和**最后一个**值表示，Range可以是**包含或排除**。包含范围包括从第一个到最后一个的所有值，而独占范围包括除最后一个之外的所有值。这里有一些范例文字的例子 -

- 1..10 - **包含**范围的示例
- 1 .. <10 - **独占**范围的示例
- 'a'..'x' - 范围也可以由**字符**组成
- 10..1 - 范围也可以按降序排列
- 'x'..'a' - 范围也可以由字符组成并按降序排列。

以下是可用于范围的各种方法。

| 序号 |                          方法和描述                          |
| :--- | :----------------------------------------------------------: |
| 1    | [contains()](https://www.w3cschool.cn/groovy/groovy_contains.html)检查范围是否包含特定值 |
| 2    | [get()](https://www.w3cschool.cn/groovy/groovy_get.html)返回此范围中指定位置处的元素。 |
| 3    | [getFrom()](https://www.w3cschool.cn/groovy/groovy_getfrom.html)获得此范围的下限值。 |
| 4    | [getTo()](https://www.w3cschool.cn/groovy/groovy_getto.html)获得此范围的上限值。 |
| 5    | [isReverse()](https://www.w3cschool.cn/groovy/groovy_isreverse.html)这是一个反向的范围，反向迭代 |
| 6    | [size()](https://www.w3cschool.cn/groovy/groovy_size.html)返回此范围的元素数。 |
| 7    | [subList()](https://www.w3cschool.cn/groovy/groovy_sublist.html)返回此指定的fromIndex（包括）和toIndex（排除）之间的此范围部分的视图 |

# Groovy 列表

列表是用于存储数据项集合的结构。在 Groovy 中，**List** 保存了一系列对象引用。

List 中的对象引用占据序列中的位置，并通过整数索引来区分。

列表文字表示为一系列用逗号分隔并用方括号括起来的对象。

groovy 列表使用索引操作符 [] 索引。列表索引从 0 开始，指第一个元素。

groovy 中的一个列表中的数据可以是任意类型。这 java 下集合列表有些不同，java 下的列表是同种类型的数据集合。

groovy 列表可以嵌套列表。如 [1,2,[3,4,5],“aaa”] groovy 列表内置有反转方法 reverse()。调用 List.reverse() 可以实现列表反转。groovy 列表内置有排序方法 sort()。调用 List.sort() 可以实现列表排序。空列表表示为 [] 声明一个空集合：

```groovy
def list1 = []  
def list2 = [1,2,3,4]  
list2.add(12)  
list2.add(12)  
println list1.size()
```

列表间的几个常用方法：

1、添加：

```groovy
def list1 = [100, 101]
def list2 = [ 99,98,1]
println list2.plus(list1) //输出结果： [99, 98, 1, 100, 101]
// list2.plus(list1) 也可以写成 list2 + list1
```

2、删除：

```groovy
def list1 = [12, 13]
def list2 = [11, 2, 33, 12, 13, 16]
println list2.minus(list1) //输出结果： [11, 2, 33, 16]
//list2.minus(list1) 也可以写成 list2 - list1
```

在本章中，我们将讨论 Groovy 中可用的列表方法。

| 序号 |                          方法和描述                          |
| :--- | :----------------------------------------------------------: |
| 1    | [add()](https://www.w3cschool.cn/groovy/groovy_add.html)将新值附加到此列表的末尾。 |
| 2    | [contains()](https://www.w3cschool.cn/groovy/groovy_lists_contains.html)如果此列表包含指定的值，则返回 true。 |
| 3    | [get()](https://www.w3cschool.cn/groovy/groovy_lists_get.html)返回此列表中指定位置的元素。 |
| 4    | [isEmpty()](https://www.w3cschool.cn/groovy/groovy_isempty.html)如果此列表不包含元素，则返回 true |
| 5    | [minus()](https://www.w3cschool.cn/groovy/groovy_lists_minus.html)创建一个由原始元素组成的新列表，而不是集合中指定的元素。 |
| 6    | [plus()](https://www.w3cschool.cn/groovy/groovy_lists_plus.html)创建由原始元素和集合中指定的元素组成的新列表。 |
| 7    | [pop()](https://www.w3cschool.cn/groovy/groovy_pop.html)从此列表中**删除**最后一个项目 |
| 8    | [remove()](https://www.w3cschool.cn/groovy/groovy_remove.html)删除此列表中指定位置的元素。 |
| 9    | [reverse()](https://www.w3cschool.cn/groovy/groovy_reverse.html)创建与原始列表的元素相反的新列表 |
| 10   | [size()](https://www.w3cschool.cn/groovy/groovy_lists_size.html)获取此列表中的元素数。 |
| 11   | [sort()](https://www.w3cschool.cn/groovy/groovy_sort.html)返回原始列表的排序副本。 |

# Groovy 映射

映射（也称为**关联数组**，字典，表和散列）是对象引用的无序集合。Map集合中的元素由键值访问。 Map中使用的键可以是任何类。当我们插入到Map集合中时，需要两个值：键和值。

以下是一些映射的例子 -

- ['TopicName'：'Lists'，'TopicName'：'Maps'] - 具有TopicName作为键的键值对的集合及其相应的值。
- [：] - 空映射。

在本章中，我们将讨论Groovy中可用的映射方法。

| 序号 |                          方法和描述                          |
| :--- | :----------------------------------------------------------: |
| 1    | [containsKey()](https://www.w3cschool.cn/groovy/groovy_containskey.html)此映射是否包含此键？ |
| 2    | [get()](https://www.w3cschool.cn/groovy/groovy_maps_get.html)查找此Map中的键并返回相应的值。如果此映射中没有键的条目，则返回null。 |
| 3    | [keySet()](https://www.w3cschool.cn/groovy/groovy_keyset.html)获取此映射中的一组键。 |
| 4    | [put()](https://www.w3cschool.cn/groovy/groovy_put.html)将指定的值与此映射中的指定键相关联。如果此映射先前包含此键的映射，则旧值将替换为指定的值。 |
| 5    | [size()](https://www.w3cschool.cn/groovy/groovy_maps_size.html)返回此映射中的键值映射的数量。 |
| 6    | [values()](https://www.w3cschool.cn/groovy/groovy_values.html)返回此映射中包含的值的集合视图。 |

# Groovy 日期和时间

类Date表示特定的时刻，具有**毫秒精度**。 Date类有两个构造函数，如下所示。

## Date()

### 句法

```groovy
public Date()
```

**参数** 

  无。

**返回值**

分配一个Date对象并初始化它，以便它表示分配的时间，以最近的毫秒为单位。

### 例子

下面是一个使用这个方法的例子 -

```groovy
class Example { 
   static void main(String[] args) { 
      Date date = new Date(); 
      
      // display time and date using toString() 
      System.out.println(date.toString()); 
   } 
} 
```

当我们运行上面的程序，我们将得到以下结果。以下输出将为您提供当前日期和时间 -

```powershell
Thu Dec 10 21:31:15 GST 2015
```

## Date (长毫秒)

### 句法

```groovy
public Date(long millisec)
```

**参数**

毫秒 - millisecconds的数量，因为标准的基准时间指定。

**返回值** -分配一个Date对象并将其初始化以表示自标准基准时间（称为“该历元”，即1970年1月1日，00:00:00 GMT）起指定的毫秒数。

### 例子

下面是一个使用这个方法的例子 -

```groovy
class Example {
   static void main(String[] args) {
      Date date = new Date(100);
      
      // display time and date using toString()
      System.out.println(date.toString());
   } 
}
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
Thu Jan 01 04:00:00 GST 1970
```

以下是Date类的给定方法。在接受或返回年，月，日，小时，分钟和秒值的类Date的所有方法中，使用以下表示形式 -

- 年y由整数y-1900表示。
- 一个月份由0到11的整数表示; 0是1月，1是2月，等等;因此11是12月。
- 日期（月中的日）以通常方式由1至31的整数表示。
- 一个小时由从0到23的整数表示。因此，从午夜到上午1点的小时是小时0，而从中午到下午1点的小时是小时12。
- 分钟由通常方式的0至59的整数表示。
- 第二个由0至61的整数表示。

| 序号 |                          方法和描述                          |
| :--- | :----------------------------------------------------------: |
| 1    | [after()](https://www.w3cschool.cn/groovy/groovy_after.html)测试此日期是否在指定日期之后。 |
| 2    | [equals()](https://www.w3cschool.cn/groovy/groovy_dates_times_equals.html)比较两个日期的相等性。当且仅当参数不为null时，结果为true，并且是表示与该对象时间相同的时间点（毫秒）的Date对象。 |
| 3    | [compareTo()](https://www.w3cschool.cn/groovy/groovy_dates_times_compareto.html)比较两个日期的顺序。 |
| 4    | [toString()](https://www.w3cschool.cn/groovy/groovy_dates_times_tostring.html)将此Date对象转换为字符串 |
| 5    | [before()](https://www.w3cschool.cn/groovy/groovy_before.html)测试此日期是否在指定日期之前。 |
| 6    | [getTime()](https://www.w3cschool.cn/groovy/groovy_gettime.html)返回自此Date对象表示的1970年1月1日，00:00:00 GMT以来的毫秒数。 |
| 7    | [setTime()](https://www.w3cschool.cn/groovy/groovy_settime.html)设置此Date对象以表示一个时间点，即1970年1月1日00:00:00 GMT之后的时间毫秒。 |

# Groovy 正则表达式

正则表达式是用于在文本中查找子字符串的模式。 `Groovy` 使用`〜“regex”`表达式本地支持正则表达式。引号中包含的文本表示用于比较的表达式。

例如，我们可以创建一个**正则表达式**对象，如下所示 -

```groovy
def regex = ~'Groovy'
```

当 `Groovy` 运算符`=〜`在` if` 和 `while` 语句（见第8章）中作为**谓词**（**返回布尔值的表达式**）出现时，左侧的 `String` 操作数与右侧的正则表达式操作数匹配。因此，以下每个都传递值 `true`。

当定义正则表达式时，可以使用以下特殊字符

- 有两个特殊的位置字符用于表示一行的开始和结束：caret（∧）和美元符号（$）。
- 正则表达式也可以包括量词。加号（+）表示一次或多次，应用于表达式的前一个元素。星号（*）用于表示零个或多个出现。问号（？）表示零或一次。
- 元字符{和}用于匹配前一个字符的特定数量的实例。
- 在正则表达式中，句点符号（。）可以表示任何字符。这被描述为通配符。
- 正则表达式可以包括字符类。一组字符可以作为简单的字符序列，包含在元字符[和]中，如[aeiou]中。对于字母或数字范围，可以使用`[a-z]`或`[a-mA-M]`中的短划线分隔符。字符类的补码由方括号内的前导插入符号表示，如`[∧a-z]`中所示，并表示除指定的字符以外的所有字符。下面给出了正则表达式的一些示例。

```groovy
'Groovy' =~ 'Groovy' 
'Groovy' =~ 'oo' 
'Groovy' ==~ 'Groovy' 
'Groovy' ==~ 'oo' 
'Groovy' =~ '∧G' 
'Groovy' =~ 'G$' 
'Groovy' =~ 'Gro*vy'
'Groovy' =~ 'Gro{2}vy'
```

# Groovy 异常处理

任何编程语言都需要异常处理来处理运行时错误，从而可以保持应用程序的正常流程。

异常通常会破坏应用程序的正常流程，这就是为什么我们需要在我们的应用程序中使用异常处理的原因。

例如大致分为以下类别 -

- **检测异常** -扩展Throwable类（除了RuntimeException和Error）的类称为检查异常egIOException，SQLException等。检查的异常在编译时检查。

一个典型的情况是FileNotFoundException。假设您的应用程序中有以下代码，它从E盘中的文件读取。

```groovy
class Example {
   static void main(String[] args) {
      File file = new File("E://file.txt");
      FileReader fr = new FileReader(file);
   } 
}
```

如果文件（file.txt）不在E盘中，那么将引发以下异常。

抓取：java.io.FileNotFoundException：E：\ file.txt（系统找不到指定的文件）。

java.io.FileNotFoundException：E：\ file.txt（系统找不到指定的文件）。

- **未经检查的异常** -扩展RuntimeException的类称为未检查异常，例如，ArithmeticException，NullPointerException，ArrayIndexOutOfBoundsException等。未检查的异常在编译期不检查，而是在运行时检查。

一个典型的情况是ArrayIndexOutOfBoundsException，当您尝试访问大于数组长度的数组的索引时，会发生这种情况。以下是这种错误的典型例子。

```groovy
class Example {
   static void main(String[] args) {
      def arr = new int[3];
      arr[5] = 5;
   } 
}
```

当上面的代码执行时，将引发以下异常。

抓取：java.lang.ArrayIndexOutOfBoundsException：5

java.lang.ArrayIndexOutOfBoundsException：5

- **错误** -错误无法恢复。 OutOfMemoryError，VirtualMachineError，AssertionError等。

这些是程序永远不能恢复的错误，将导致程序崩溃。

下图显示了如何组织Groovy中的异常层次结构。它都基于Java中定义的层次结构。

## 捕捉异常

方法使用try和catch关键字的组合捕获异常。 try / catch块放置在可能生成异常的代码周围。

```groovy
try { 
   //Protected code 
} catch(ExceptionName e1) {
   //Catch block 
}
```

所有可能引发异常的代码都放在受保护的代码块中。

在catch块中，您可以编写自定义代码来处理异常，以便应用程序可以从异常中恢复。

让我们看一个类似的代码示例，我们在上面看到一个索引值大于数组大小的数组。但这次让我们将我们的代码包装在try / catch块中。

```groovy
class Example {
   static void main(String[] args) {
      try {
         def arr = new int[3];
         arr[5] = 5;
      } catch(Exception ex) {
         println("Catching the exception");
      }
		
      println("Let's move on after the exception");
   }
}
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
Catching the exception 
Let's move on after the exception
```

从上面的代码，我们在try块中包装错误的代码。在catch块中，我们只是捕获我们的异常并输出一个异常已经发生的消息。

## 多个捕获块

可以有多个catch块来处理多种类型的异常。对于每个catch块，根据引发的异常的类型，您将编写代码来相应地处理它。

让我们修改上面的代码来具体捕捉ArrayIndexOutOfBoundsException。以下是代码段。

```groovy
class Example {
   static void main(String[] args) {
      try {
         def arr = new int[3];
         arr[5] = 5;
      }catch(ArrayIndexOutOfBoundsException ex) {
         println("Catching the Array out of Bounds exception");
      }catch(Exception ex) {
         println("Catching the exception");
      }
		
      println("Let's move on after the exception");
   } 
}
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
Catching the Aray out of Bounds exception 
Let's move on after the exception
```

从上面的代码，你可以看到ArrayIndexOutOfBoundsException catch块首先被捕获，因为它意味着异常的标准。

## finally块

**finally**块跟在try块或catch块之后。代码的finally块总是执行，而不管异常的发生。

使用finally块可以运行任何你想要执行的清除类型语句，无论在受保护代码中发生什么。该块的语法如下。

```groovy
try { 
   //Protected code 
} catch(ExceptionType1 e1) { 
   //Catch block 
} catch(ExceptionType2 e2) { 
   //Catch block 
} catch(ExceptionType3 e3) { 
   //Catch block 
} finally {
   //The finally block always executes. 
}
```

让我们修改我们上面的代码并添加finally代码块。以下是代码段。

```groovy
class Example {
   static void main(String[] args) {
      try {
         def arr = new int[3];
         arr[5] = 5;
      } catch(ArrayIndexOutOfBoundsException ex) {
         println("Catching the Array out of Bounds exception");
      }catch(Exception ex) {
         println("Catching the exception");
      } finally {
         println("The final block");
      }
		
      println("Let's move on after the exception");
   } 
} 
```

当我们运行上面的程序，我们将得到以下结果 -

```
Catching the Array out of Bounds exception 
The final block 
Let's move on after the exception
```

以下是Groovy中提供的异常方法 -

### public String getMessage（）

返回有关已发生异常的详细消息。此消息在Throwable构造函数中初始化。

### 

### public Throwable getCause()

返回由Throwable对象表示的异常原因。

### 

### public String toString()

返回与getMessage（）的结果连接的类的名称。

### 

### public void printStackTrace()

将toString（）的结果与堆栈跟踪一起打印到System.err，错误输出流。

### 

### public StackTraceElement [] getStackTrace()

返回包含堆栈跟踪上的每个元素的数组。索引0处的元素表示调用堆栈的顶部，数组中的最后一个元素表示调用堆栈底部的方法。

### 

### public Throwable fillInStackTrace()

使用当前堆栈跟踪填充此Throwable对象的堆栈跟踪，添加到堆栈跟踪中的任何以前的信息。

### 例子

下面是使用上面给出的一些方法的代码示例 -

```groovy
class Example {
   static void main(String[] args) {
      try {
         def arr = new int[3];
         arr[5] = 5;
      }catch(ArrayIndexOutOfBoundsException ex) {
         println(ex.toString());
         println(ex.getMessage());
         println(ex.getStackTrace());  
      } catch(Exception ex) {
         println("Catching the exception");
      }finally {
         println("The final block");
      }
		
      println("Let's move on after the exception");
   } 
}
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
java.lang.ArrayIndexOutOfBoundsException: 5 
5 
[org.codehaus.groovy.runtime.dgmimpl.arrays.IntegerArrayPutAtMetaMethod$MyPojoMetaMet 
hodSite.call(IntegerArrayPutAtMetaMethod.java:75), 
org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48) ,
org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113) ,
org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133) ,
Example.main(Sample:8), sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method),
sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57),
sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ,
java.lang.reflect.Method.invoke(Method.java:606),
org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:93),
groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325),
groovy.lang.MetaClassImpl.invokeStaticMethod(MetaClassImpl.java:1443),
org.codehaus.groovy.runtime.InvokerHelper.invokeMethod(InvokerHelper.java:893),
groovy.lang.GroovyShell.runScriptOrMainOrTestOrRunnable(GroovyShell.java:287),
groovy.lang.GroovyShell.run(GroovyShell.java:524),
groovy.lang.GroovyShell.run(GroovyShell.java:513),
groovy.ui.GroovyMain.processOnce(GroovyMain.java:652),
groovy.ui.GroovyMain.run(GroovyMain.java:384),
groovy.ui.GroovyMain.process(GroovyMain.java:370),
groovy.ui.GroovyMain.processArgs(GroovyMain.java:129),
groovy.ui.GroovyMain.main(GroovyMain.java:109),
sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method),
sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57),
sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ,
java.lang.reflect.Method.invoke(Method.java:606),
org.codehaus.groovy.tools.GroovyStarter.rootLoader(GroovyStarter.java:109),
org.codehaus.groovy.tools.GroovyStarter.main(GroovyStarter.java:131),
sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method),
sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57),
sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ,
java.lang.reflect.Method.invoke(Method.java:606),
com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)]
 
The final block 
Let's move on after the exception 
```

# Groovy 面向对象

在Groovy中，如在任何其他面向对象语言中一样，存在类和对象的概念以表示编程语言的对象定向性质。Groovy类是数据的集合和对该数据进行操作的方法。在一起，类的数据和方法用于表示问题域中的一些现实世界对象。

Groovy中的类声明了该类定义的对象的状态（数据）和行为。因此，Groovy类描述了该类的实例字段和方法。

以下是Groovy中的一个类的示例。类的名称是Student，它有两个字段 - **StudentID**和**StudentName**。在main函数中，我们创建一个这个类的对象，并将值分配给对象的**StudentID**和**StudentName**。

```groovy
class Student {
   int StudentID;
   String StudentName;
	
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      st.StudentName = "Joe"     
   } 
}
```

## getter和setter方法

在任何编程语言中，总是使用private关键字隐藏实例成员，而是提供getter和setter方法来相应地设置和获取实例变量的值。以下示例显示如何完成此操作。

```groovy
class Student {
   private int StudentID;
   private String StudentName;
	
   void setStudentID(int pID) {
      StudentID = pID;
   }
	
   void setStudentName(String pName) {
      StudentName = pName;
   }
	
   int getStudentID() {
      return this.StudentID;
   }
	
   String getStudentName() {
      return this.StudentName;
   }
	
   static void main(String[] args) {
      Student st = new Student();
      st.setStudentID(1);
      st.setStudentName("Joe");
		
      println(st.getStudentID());
      println(st.getStudentName());
   } 
}
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
1 
Joe 
```

请注意以下关于上述程序的要点 -

- 在类中，studentID和studentName都标记为private，这意味着无法从类外部访问它们。
- 每个实例成员都有自己的getter和setter方法。getter方法返回实例变量的值，例如方法int getStudentID（）和setter方法设置实例ID的值，例如method - void setStudentName（String pName）

## 实例方法

在类中包含更多的方法通常是一个很自然的事情，它实际上为类实现了一些功能。在我们的学生示例中，让我们添加Marks1，Marks2和Marks3的实例成员，以表示学生在3个科目中的标记。然后我们将添加一个新的实例方法，计算学生的总分。以下是代码的外观。

在下面的示例中，Total方法是一个额外的Instance方法，它内置了一些逻辑。

```groovy
class Student {
   int StudentID;
   String StudentName;
	
   int Marks1;
   int Marks2;
   int Marks3;
	
   int Total() {
      return Marks1+Marks2+Marks3;
   }
	
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      st.StudentName="Joe";
		
      st.Marks1 = 10;
      st.Marks2 = 20;
      st.Marks3 = 30;
		
      println(st.Total());
   }
}
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
60
```

## 创建多个对象

你也可以创建一个类的多个对象。下面是如何实现这一点的例子。在这里，我们创建3个对象（st，st1和st2）并相应地调用它们的实例成员和实例方法。

```groovy
class Student {
   int StudentID;
   String StudentName;
	
   int Marks1;
   int Marks2;
   int Marks3;
	
   int Total() { 
      return Marks1+Marks2+Marks3;
   } 
	
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      st.StudentName = "Joe";
		
      st.Marks1 = 10;
      st.Marks2 = 20;
      st.Marks3 = 30;
		
      println(st.Total()); 
   
      Student st1 = new Student();
      st1.StudentID = 1;
      st1.StudentName = "Joe";
		
      st1.Marks1 = 10;
      st1.Marks2 = 20;
      st1.Marks3 = 40;
		
      println(st1.Total());  
        
      Student st2 = new Student();
      st2.StudentID = 1;
      st2.StudentName = "Joe";
		
      st2.Marks1 = 10; 
      st2.Marks2 = 20;
      st2.Marks3 = 50;
		
      println(st2.Total());
   } 
} 
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
60 
70 
80 
```

## 继承 

继承可以定义为一个类获取另一个类的属性（方法和字段）的过程。通过使用继承，信息以分级顺序可管理。

继承其他属性的类称为子类（派生类，子类），属性继承的类称为超类（基类，父类）。

## 扩展

extends是用于继承类的属性的关键字。下面给出了extends关键字的语法。在下面的例子中，我们做了以下事情 -

- 创建一个名为Person的类。这个类有一个名为name的实例成员。
- 创建一个名为Student的类，它从Person类继承。请注意，在Person类中定义的名称实例成员在Student类中继承。
- 在Student类构造函数中，我们调用了基类构造函数。
- 在我们的Student类中，我们添加了2个StudentID和Marks1的实例成员。

```groovy
class Example {
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
		
      st.Marks1 = 10;
      st.name = "Joe";
		
      println(st.name);
   }
} 

class Person {
   public String name;
   public Person() {}  
} 

class Student extends Person {
   int StudentID
   int Marks1;
	
   public Student() {
      super();
   } 
}   
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
Joe
```

## 内部类



内部类在另一个类中定义。封闭类可以像往常一样使用内部类。另一方面，内部类可以访问其封闭类的成员，即使它们是私有的。不允许除封闭类之外的类访问内部类。

下面是一个外部和内部类的例子。在下面的例子中，我们做了以下事情 -

- 创建一个名为Outer的类，它将是我们的外部类。
- 在Outer类中定义名为name的字符串。
- 在我们的外类中创建一个内部或嵌套类。
- 请注意，在内部类中，我们可以访问在Outer类中定义的名称实例成员。

```groovy
class Example { 
   static void main(String[] args) { 
      Outer outobj = new Outer(); 
      outobj.name = "Joe"; 
      outobj.callInnerMethod() 
   } 
} 

class Outer { 
   String name;
	
   def callInnerMethod() { 
      new Inner().methodA() 
   } 
	
   class Inner {
      def methodA() { 
         println(name); 
      } 
   } 
	
}   
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
Joe
```

## 抽象类

抽象类表示通用概念，因此，它们不能被实例化，被创建为子类化。他们的成员包括字段/属性和抽象或具体方法。抽象方法没有实现，必须通过具体子类来实现。抽象类必须用抽象关键字声明。抽象方法也必须用抽象关键字声明。

在下面的示例中，请注意，Person类现在是一个抽象类，不能被实例化。还要注意，在抽象类中有一个名为DisplayMarks的抽象方法，没有实现细节。在学生类中，必须添加实现细节。

```groovy
class Example { 
   static void main(String[] args) { 
      Student st = new Student(); 
      st.StudentID = 1;
		
      st.Marks1 = 10; 
      st.name="Joe"; 
		
      println(st.name); 
      println(st.DisplayMarks()); 
   } 
} 

abstract class Person { 
   public String name; 
   public Person() { } 
   abstract void DisplayMarks();
}
 
class Student extends Person { 
   int StudentID 
   int Marks1; 
	
   public Student() { 
      super(); 
   } 
	
   void DisplayMarks() { 
      println(Marks1); 
   }  
} 
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
Joe 
10 
```

## 接口

接口定义了类需要遵守的契约。接口仅定义需要实现的方法的列表，但是不定义方法实现。需要使用interface关键字声明接口。接口仅定义方法签名。接口的方法总是公开的。在接口中使用受保护或私有方法是一个错误。

以下是groovy中的接口示例。在下面的例子中，我们做了以下事情 -

- 创建一个名为Marks的接口并创建一个名为DisplayMarks的接口方法。
- 在类定义中，我们使用implements关键字来实现接口。 因为我们是实现
- 因为我们正在实现接口，我们必须为DisplayMarks方法提供实现。

```groovy
class Example {
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      st.Marks1 = 10;
      println(st.DisplayMarks());
   } 
} 

interface Marks { 
   void DisplayMarks(); 
} 

class Student implements Marks {
   int StudentID
   int Marks1;
	
   void DisplayMarks() {
      println(Marks1);
   }
}
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
10
```

# Groovy 泛型

- 没啥东西

# Groovy 特征

特征是语言的结构构造，允许 -

- 行为的组成。
- 接口的运行时实现。
- 与静态类型检查/编译的兼容性

它们可以被看作是承载默认实现和状态的接口。使用trait关键字定义 trait。

下面给出了一个特征的例子：

```groovy
trait Marks {
   void DisplayMarks() {
      println("Display Marks");
   } 
}
```

然后可以使用 implement 关键字以类似于接口的方式实现 trait。

```groovy
class Example {
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      st.Marks1 = 10; 
      println(st.DisplayMarks());
   } 
} 

trait Marks { 
   void DisplayMarks() {
      println("Display Marks");
   } 
} 

class Student implements Marks { 
   int StudentID
   int Marks1;
}
```

## 实现接口

Traits 可以实现接口，在这种情况下，使用 interface 关键字声明接口。

下面给出了实现接口的特征的示例。在以下示例中，可以注意以下要点。

- 接口 Total 使用方法 DisplayTotal 定义。
- 特征 Marks 实现了 Total 接口，因此需要为 DisplayTotal 方法提供一个实现。

```groovy
class Example {
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      st.Marks1 = 10;
		
      println(st.DisplayMarks());
      println(st.DisplayTotal());
   } 
} 

interface Total {
   void DisplayTotal() 
} 

trait Marks implements Total {
   void DisplayMarks() {
      println("Display Marks");
   }
	
   void DisplayTotal() {
      println("Display Total"); 
   } 
} 

class Student implements Marks { 
   int StudentID
   int Marks1;  
} 
```

上述程序的输出将是 -

```powershell
Display Marks 
Display Total
```

## 属性

特征可以定义属性。下面给出了具有属性的trait的示例。

在以下示例中，integer 类型的 Marks1 是一个属性。

```groovy
class Example {
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
		
      println(st.DisplayMarks());
      println(st.DisplayTotal());
   } 
	
   interface Total {
      void DisplayTotal() 
   } 
	
   trait Marks implements Total {
      int Marks1;
		
      void DisplayMarks() {
         this.Marks1 = 10;
         println(this.Marks1);
      }
		
      void DisplayTotal() {
         println("Display Total");
      } 
   } 
	
   class Student implements Marks {
      int StudentID 
   }
} 
```

上述程序的输出将是 -

```powershell
10 
Display Total
```

## 行为的构成

特征可以用于以受控的方式实现**多重继承**，避免钻石问题。在下面的代码示例中，我们定义了两个特征 - Marks 和 Total。我们的 Student 类实现了两个特征。由于学生类扩展了这两个特征，它能够访问这两种方法 - DisplayMarks 和 DisplayTotal。

```groovy
class Example {
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
		
      println(st.DisplayMarks());
      println(st.DisplayTotal()); 
   } 
} 

trait Marks {
   void DisplayMarks() {
      println("Marks1");
   } 
} 

trait Total {
   void DisplayTotal() { 
      println("Total");
   } 
}  

class Student implements Marks,Total {
   int StudentID 
}   
```

上述程序的输出将是 -

```powershell
Marks1
Total 
```

## 扩展特征

特征可能**扩展**另一个特征，在这种情况下，**必须使用**extends关键字。在下面的代码示例中，我们使用 Marks trait 扩展了 Total trait。

```groovy
class Example {
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      println(st.DisplayMarks());
   } 
} 

trait Marks {
   void DisplayMarks() {
      println("Marks1");
   } 
} 

trait Total extends Marks {
   void DisplayMarks() {
      println("Total");
   } 
}  

class Student implements Total {
   int StudentID 
}
```

上述程序的输出将是 -

```powershell
Total
```

# Groovy 闭包

闭包是一个**短的匿名代码块**。它通常跨越几行代码。一个方法甚至可以**将代码块作为参数**。它们是匿名的。

下面是一个简单闭包的例子，它是什么样子。

```groovy
class Example {
   static void main(String[] args) {
      def clos = {println "Hello World"};
      clos.call();
   } 
}
```

在上面的例子中，代码行 - {println“Hello World”}被称为闭包。此标识符引用的代码块可以使用call语句执行。

当我们运行上面的程序，我们将得到以下结果 -

```powershell
Hello World
```

## 一、闭包中的形式参数

闭包也可以包含形式参数，以使它们更有用，就像Groovy中的方法一样。

```groovy
class Example {
   static void main(String[] args) {
      def clos = {param->println "Hello ${param}"}; // 一定得用，双引号
      clos.call("World");
   } 
}
```

在上面的代码示例中，注意使用$ {param}，这导致closure接受一个参数。当通过clos.call语句调用闭包时，我们现在可以选择将一个参数传递给闭包。

当我们运行上面的程序，我们将得到以下结果 -

```powershell
Hello World
```

下一个图重复了前面的例子并产生相同的结果，但显示可以使用被称为它的**隐式单个参数**。这里的**`it`**是Groovy中的**关键字**。

```groovy
class Example {
   static void main(String[] args) {
      def clos = {println "Hello ${it}"};
      clos.call("World");
   } 
}
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
Hello World
```

## 二、闭包和变量

更正式地，闭包可以在定义闭包时**引用变量**。以下是如何实现这一点的示例。

```groovy
class Example {     
   static void main(String[] args) {
      def str1 = "Hello";
      def clos = {param -> println "${str1} ${param}"}
      clos.call("World");
		
      // We are now changing the value of the String str1 which is referenced in the closure
      str1 = "Welcome";
      clos.call("World");
   } 
}
```

在上面的例子中，除了向闭包传递参数之外，我们还定义了一个名为str1的变量。闭包也接受变量和参数。

当我们运行上面的程序，我们将得到以下结果 -

```powershell
Hello World 
Welcome World
```

## 三、在方法中使用闭包

闭包也可以用作方法的参数。在Groovy中，很多用于数据类型（例如列表和集合）的内置方法都有闭包作为参数类型。

以下示例显示如何将闭包作为参数发送到方法。

```groovy
class Example { 
   def static Display(clo) {
      // This time the $param parameter gets replaced by the string "Inner"         
      clo.call("Inner");
   } 
	
   static void main(String[] args) {
      def str1 = "Hello";
      def clos = { param -> println "${str1} ${param}" }
      clos.call("World");
		
      // We are now changing the value of the String str1 which is referenced in the closure
      str1 = "Welcome";
      clos.call("World");

      // Passing our closure to a method
      Example.Display(clos);
   } 
}
```

在上述示例中，

- 我们定义一个名为Display的静态方法，它将闭包作为参数。
- 然后我们在我们的main方法中定义一个闭包，并将它作为一个参数传递给我们的Display方法。

当我们运行上面的程序，我们将得到以下结果 -

```powershell
Hello World 
Welcome World 
Welcome Inner
```

## 四、集合和字符串中的闭包

集合List，Map和String方法接受一个闭包作为参数。让我们看看在这些数据类型中如何使用闭包的例子。

### 使用闭包和列表

以下示例显示如何使用闭包与列表。在下面的例子中，我们首先定义一个简单的值列表。列表集合类型然后定义一个名为.each的函数。此函数将闭包作为参数，并将闭包应用于列表的每个元素

```groovy
class Example {
   static void main(String[] args) {
      def lst = [11, 12, 13, 14];
      lst.each {println it}
   } 
}
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
11 
12 
13 
14
```

### 使用映射闭包

以下示例显示了如何使用闭包。在下面的例子中，我们首先定义一个简单的关键值项Map。然后，映射集合类型定义一个名为.each的函数。此函数将闭包作为参数，并将闭包应用于映射的每个键值对。

```powershell
class Example {
   static void main(String[] args) {
      def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]             
      mp.each {println it}
      mp.each {println "${it.key} maps to: ${it.value}"}
   } 
}
```

当我们运行上面的程序，我们会得到以下结果 -

```powershell
TopicName = Maps 
TopicDescription = Methods in Maps 
TopicName maps to: Maps 
TopicDescription maps to: Methods in Maps
```

通常，我们可能希望遍历集合的成员，并且仅当元素满足一些标准时应用一些逻辑。这很容易用闭包中的条件语句来处理。

```powershell
class Example {
   static void main(String[] args) {
      def lst = [1,2,3,4];
      lst.each {println it}
      println("The list will only display those numbers which are divisible by 2")
      lst.each{num -> if(num % 2 == 0) println num}
   } 
}
```

上面的例子显示了在闭包中使用的条件if（num％2 == 0）表达式，用于检查列表中的每个项目是否可被2整除。

当我们运行上面的程序，我们会得到以下结果 -

```powershell
1 
2 
3 
4 
The list will only display those numbers which are divisible by 2.
2 
4 
```

## 五、闭包使用的方法

闭包本身提供了一些方法。

虽然，讲的都是，集合的，api，但是，闭包，好像真JB有这些，东西呢。

| 序号 |                          方法和描述                          |
| :--- | :----------------------------------------------------------: |
| 1    | [find()](https://www.w3cschool.cn/groovy/groovy_find.html)find方法查找集合中与某个条件匹配的第一个值。 |
| 2    | [findAll（）](https://www.w3cschool.cn/groovy/groovy_findall.html)它找到接收对象中与闭合条件匹配的所有值。 |
| 3    | [any() & every()](https://www.w3cschool.cn/groovy/groovy_any_every.html)方法any迭代集合的每个元素，检查布尔谓词是否对至少一个元素有效。 |
| 4    | [collect()](https://www.w3cschool.cn/groovy/groovy_collect.html)该方法通过集合收集迭代，使用闭包作为变换器将每个元素转换为新值。 |

# Groovy 注释

注释是**元数据的形式**，其中它们提供关于**不是程序本身**的一部分的**程序的数据**。注释对它们注释的代码的操作没有直接影响。

注释主要用于以下原因 -

- **编译器信息** -编译器可以使用注释来**检测错误**或**抑制警告**。
- **编译时和部署时处理** -软件工具可以处理注释信息以**生成代码**，**XML**文件等。
- **运行时处理** -一些注释可以在**运行时检查**。

在Groovy中，基本**注释**如下所示：

@interface - at符号字符（@）向编译器指示以下是注释。

注释可以以没有主体的方法的形式和可选的默认值来定义成员。

注释可以应用于以下类型 -

## 单行注释 

单行注释以//开头，并且能在行的任何位置。从//开始，到一行结束，都被认为是注释的部分。

```groovy
// a standalone single line comment
println "hello" // a comment till the end of the line
```

## 多行注释 

多行注释以/*开头，并且能在行的任何位置 。以/*开头，包括新的行，直到第一个*/结束都被认为是注释的部分。多行注释可以放于声明的开始或者声明的中间。

```groovy
/* a standalone multiline comment
   spanning two lines */
println "hello" /* a multiline comment starting
                   at the end of a statement */
println 1 /* one */ + 2 /* two */
```

## 字符串类型

下面给出了字符串注释的一个例子 -

```groovy
@interface Simple { 
   String str1() default "HelloWorld"; 
}
```

## 枚举类型

```groovy
enum DayOfWeek { mon, tue, wed, thu, fri, sat, sun } 
@interface Scheduled {
   DayOfWeek dayOfWeek() 
} 
```

## 类类型

```groovy
@interface Simple {} 
@Simple 
class User {
   String username
   int age
}
 
def user = new User(username: "Joe",age:1); 
println(user.age); 
println(user.username);
```

## 注释成员值

使用注释时，需要至少设置所有没有默认值的成员。下面给出一个例子。当定义后使用注释示例时，需要为其分配一个值。

```groovy
@interface Example {
   int status() 
}

@Example(status = 1)
```

## 关闭注释参数

Groovy中注释的一个很好的特性是，你也可以使用**闭包作为注释值**。因此，注释可以与各种各样的表达式一起使用。

下面给出一个例子。注释Onlyif是基于类值创建的。然后注释应用于两个方法，它们基于数字变量的值向结果变量发布不同的消息。

```groovy
@interface OnlyIf {
   Class value() 
}  

@OnlyIf({ number<=6 }) 
void Version6() {
   result << 'Number greater than 6' 
} 

@OnlyIf({ number>=6 }) 
void Version7() {
   result << 'Number greater than 6' 
}
```

## 元注释

这是groovy中注释的一个非常有用的功能。有时可能有一个方法的多个注释，如下所示。有时这可能变得麻烦有多个注释。

```groovy
@Procedure 
@Master class 
MyMasterProcedure {} 
```

在这种情况下，您可以定义一个元注释，它将多个注释集中在一起，并将元注释应用于该方法。所以对于上面的例子，你可以使用AnnotationCollector来定义注释的集合。

```groovy
import groovy.transform.AnnotationCollector
  
@Procedure 
@Master 
@AnnotationCollector
```

一旦完成，您可以应用以下元注释器到该方法 -

```groovy
import groovy.transform.AnnotationCollector
  
@Procedure 
@Master 
@AnnotationCollector
  
@MasterProcedure 
class MyMasterProcedure {}
```

# Groovy XML

XML是一种便携的**开放**源代码语言，允许程序员开发可以**被其他应用程序读取**的应用程序，而不管操作系统和/或开发语言。这是用于在应用程序之间**交换数据**的最常用的语言之一。

- 不应该是，通用，嘛

## 一、XML是什么？

可扩展标记语言XML是一种非常类似于HTML或SGML的标记语言。这是**万维网联盟推荐**的，可作为**开放标准**。XML对于跟踪**少量**到**中等数据量**而不需要基于SQL的骨干非常有用。

## Groovy中的XML支持

Groovy语言还提供了对XML语言的丰富支持。使用的两个最基本的**XML**类是 -

- **XML标记构建器** - Groovy支持基于树的标记生成器**BuilderSupport**，它可以被子类化以生成各种树结构对象表示。通常，这些构建器用于表示XML标记，HTML标记。 Groovy的标记生成器捕获对伪方法的调用，并将它们转换为树结构的元素或节点。这些伪方法的参数被视为节点的属性。作为方法调用一部分的闭包被视为生成的树节点的嵌套子内容。
- **XML解析器** - Groovy **XmlParser**类使用一个简单的模型来将XML文档解析为Node实例的树。每个节点都有XML元素的名称，元素的属性和对任何子节点的引用。这个模型足够用于大多数简单的XML处理。

对于所有的XML代码示例，让我们使用以下简单的XML文件movies.xml来构建XML文件并随后读取该文件。

```xml
<collection shelf = "New Arrivals"> 

   <movie title = "Enemy Behind"> 
      <type>War, Thriller</type> 
      <format>DVD</format> 
      <year>2003</year> 
      <rating>PG</rating> 
      <stars>10</stars> 
      <description>Talk about a US-Japan war</description> 
   </movie> 
	
   <movie title = "Transformers"> 
      <type>Anime, Science Fiction</type>
      <format>DVD</format> 
      <year>1989</year> 
      <rating>R</rating> 
      <stars>8</stars> 
      <description>A schientific fiction</description> 
   </movie> 
	
   <movie title = "Trigun"> 
      <type>Anime, Action</type> 
      <format>DVD</format> 
      <year>1986</year> 
      <rating>PG</rating> 
      <stars>10</stars> 
      <description>Vash the Stam pede!</description> 
   </movie> 
	
   <movie title = "Ishtar"> 
      <type>Comedy</type> 
      <format>VHS</format> 
      <year>1987</year> 
      <rating>PG</rating> 
      <stars>2</stars> 
      <description>Viewable boredom </description> 
   </movie> 
	
</collection> 
```

## XML标记生成器

### 句法

```groovy
public MarkupBuilder()
```

MarkupBuilder用于构造整个XML文档。通过首先创建XML文档类的对象来创建XML文档。一旦创建了对象，可以调用**伪方法**来创建XML文档的各种元素。

让我们来看一个如何创建一个块的示例，即从上述XML文档中创建一个电影元素 -

```groovy
import groovy.xml.MarkupBuilder 

class Example {
   static void main(String[] args) {
      def mB = new MarkupBuilder()
		
      // Compose the builder
      mB.collection(shelf : 'New Arrivals') {
         movie(title : 'Enemy Behind')
         type('War, Thriller')
         format('DVD')
         year('2003')
         rating('PG')
         stars(10)
         description('Talk about a US-Japan war') 
      }
   } 
}
```

在上面的例子中，需要注意以下几点：

- **mB.collection（）** -这是一个标记生成器，用于创建<collection> </ collection>的头XML标签
- ***\*movie(title : 'Enemy Behind')\**** -这些伪方法使用此方法创建带有值的标记的子标记。通过指定一个名为title的值，这实际上表示需要为该元素创建一个属性。
- 向伪方法提供闭包以创建XML文档的剩余元素。
- 初始化类MarkupBuilder的默认构造函数，以便将生成的XML发布到标准输出流

当我们运行上面的程序，我们将得到以下结果 -

```xml
<collection shelf = 'New Arrivals'> 
   <movie title = 'Enemy Behind' /> 
      <type>War, Thriller</type> 
      <format>DVD</format> 
      <year>2003</year> 
      <rating>PG</rating> 
      <stars>10</stars> 
      <description>Talk about a US-Japan war</description> 
   </movie> 
</collection>
```

为了创建整个XML文档，需要执行以下操作。

- 需要创建映射条目以存储元素的不同值。
- 对于地图的每个元素，我们将值分配给每个元素。

```groovy
import groovy.xml.MarkupBuilder 

class Example {
   static void main(String[] args) {
      def mp = [1 : ['Enemy Behind', 'War, Thriller','DVD','2003', 
         'PG', '10','Talk about a US-Japan war'],
         2 : ['Transformers','Anime, Science Fiction','DVD','1989', 
         'R', '8','A scientific fiction'],
         3 : ['Trigun','Anime, Action','DVD','1986', 
         'PG', '10','Vash the Stam pede'],
         4 : ['Ishtar','Comedy','VHS','1987', 'PG', 
         '2','Viewable boredom ']] 
			
      def mB = new MarkupBuilder()  
		
      // Compose the builder
      def MOVIEDB = mB.collection('shelf': 'New Arrivals') {
         mp.each {
            sd -> 
            mB.movie('title': sd.value[0]) {  
               type(sd.value[1])
               format(sd.value[2])
               year(sd.value[3]) 
               rating(sd.value[4])
               stars(sd.value[4]) 
               description(sd.value[5]) 
            }
         }
      }
   } 
} 
```

当我们运行上面的程序，我们将得到以下结果 -

```xml
<collection shelf = 'New Arrivals'> 
   <movie title = 'Enemy Behind'> 
      <type>War, Thriller</type> 
      <format>DVD</format> 
      <year>2003</year> 
      <rating>PG</rating> 
      <stars>PG</stars> 
      <description>10</description> 
   </movie> 
   <movie title = 'Transformers'> 
      <type>Anime, Science Fiction</type> 
      <format>DVD</format> 
      <year>1989</year>
	  <rating>R</rating> 
      <stars>R</stars> 
      <description>8</description> 
   </movie> 
   <movie title = 'Trigun'> 
      <type>Anime, Action</type> 
      <format>DVD</format> 
      <year>1986</year> 
      <rating>PG</rating> 
      <stars>PG</stars> 
      <description>10</description> 
   </movie> 
   <movie title = 'Ishtar'> 
      <type>Comedy</type> 
      <format>VHS</format> 
      <year>1987</year> 
      <rating>PG</rating> 
      <stars>PG</stars> 
      <description>2</description> 
   </movie> 
</collection> 
```

## XML解析

Groovy XmlParser类使用一个简单的模型来将XML文档解析为Node实例的树。每个节点都有XML元素的名称，元素的属性和对任何子节点的引用。这个模型足够用于大多数简单的XML处理。

### 句法

```groovy
public XmlParser() 
   throws ParserConfigurationException, 
      SAXException
```

以下代码显示了如何使用XML解析器读取XML文档的示例。

让我们假设我们有同样的文档，名为Movies.xml，我们想解析XML文档并向用户显示一个正确的输出。以下代码是我们如何遍历XML文档的整个内容并向用户显示正确响应的代码段。

```groovy
import groovy.xml.MarkupBuilder 
import groovy.util.*

class Example {

   static void main(String[] args) { 
	
      def parser = new XmlParser()
      def doc = parser.parse("D:Movies.xml");
		
      doc.movie.each{
         bk->
         print("Movie Name:")
         println "${bk['@title']}"
			
         print("Movie Type:")
         println "${bk.type[0].text()}"
			
         print("Movie Format:")
         println "${bk.format[0].text()}"
			
         print("Movie year:")
         println "${bk.year[0].text()}"
			
         print("Movie rating:")
         println "${bk.rating[0].text()}"
			
         print("Movie stars:")
         println "${bk.stars[0].text()}"
			
         print("Movie description:")
         println "${bk.description[0].text()}"
         println("*******************************")
      }
   }
} 
```

当我们运行上面的程序，我们将得到以下结果 -

```powershell
Movie Name:Enemy Behind 
Movie Type:War, Thriller 
Movie Format:DVD 
Movie year:2003 
Movie rating:PG 
Movie stars:10 
Movie description:Talk about a US-Japan war 
******************************* 
Movie Name:Transformers 
Movie Type:Anime, Science Fiction 
Movie Format:DVD 
Movie year:1989 
Movie rating:R 
Movie stars:8 
Movie description:A schientific fiction 
******************************* 
Movie Name:Trigun 
Movie Type:Anime, Action
Movie Format:DVD 
Movie year:1986 
Movie rating:PG 
Movie stars:10 
Movie description:Vash the Stam pede! 
******************************* 
Movie Name:Ishtar 
Movie Type:Comedy 
Movie Format:VHS 
Movie year:1987 
Movie rating:PG 
Movie stars:2 
Movie description:Viewable boredom
```

重要的事情需要注意上面的代码。

- 正在形成类XmlParser的对象，以便它可以用于解析XML文档。
- 解析器被给定XML文件的位置。
- 对于每个电影元素，我们使用闭包浏览每个子节点并显示相关信息。

对于movie元素本身，我们使用@符号显示附加到movie元素的title属性。

# Groovy JMX

JMX是**defacto标准**，用于**监控**与Java虚拟环境有任何关系的所有应用程序。鉴于Groovy直接位于Java之上，Groovy可以利用已经为Java实现的大量工作。

## 监视JVM

可以使用java.lang.management中提供的标准类来执行JVM的监视。以下代码示例说明如何完成此操作。

```groovy
import java.lang.management.*

def os = ManagementFactory.operatingSystemMXBean 
println """OPERATING SYSTEM: 
	OS architecture = $os.arch 
	OS name = $os.name 
	OS version = $os.version 
	OS processors = $os.availableProcessors 
""" 
 
def rt = ManagementFactory.runtimeMXBean 
println """RUNTIME: 
   	Runtime name = $rt.name 
   	Runtime spec name = $rt.specName 
   	Runtime vendor = $rt.specVendor 
   	Runtime spec version = $rt.specVersion 
   	Runtime management spec version = $rt.managementSpecVersion 
   """ 

def mem = ManagementFactory.memoryMXBean 
def heapUsage = mem.heapMemoryUsage 
def nonHeapUsage = mem.nonHeapMemoryUsage 

println """MEMORY: 
   HEAP STORAGE: 
      	Memory committed = $heapUsage.committed 
      	Memory init = $heapUsage.init 
      	Memory max = $heapUsage.max 
      	Memory used = $heapUsage.used NON-HEAP STORAGE: 
      	Non-heap memory committed = $nonHeapUsage.committed 
      	Non-heap memory init = $nonHeapUsage.init 
      	Non-heap memory max = $nonHeapUsage.max 
      	Non-heap memory used = $nonHeapUsage.used 
   """
  
println "GARBAGE COLLECTION:" 
ManagementFactory.garbageCollectorMXBeans.each { gc ->
   println "	name = $gc.name"
   println "		collection count = $gc.collectionCount"
   println "		collection time = $gc.collectionTime"
   String[] mpoolNames =   gc.memoryPoolNames
	
   mpoolNames.each { 
      mpoolName -> println "		mpool name = $mpoolName"
   } 
}
```

当代码执行时，输出将根据运行代码的系统而变化。下面给出了输出的样本。

```powershell
OPERATING SYSTEM: 
   OS architecture = x86 
   OS name = Windows 7 
   OS version = 6.1 
   OS processors = 4
   
RUNTIME: 
   Runtime name = 5144@Babuli-PC 
   Runtime spec name = Java Virtual Machine Specification 
   Runtime vendor = Oracle Corporation 
   Runtime spec version = 1.7 
   Runtime management spec version = 1.2
   
MEMORY: 
   HEAP STORAGE: 
      Memory committed = 16252928 
      Memory init = 16777216 
      Memory max = 259522560 
      Memory used = 7355840
   
NON-HEAP STORAGE: 
   Non-heap memory committed = 37715968 
   Non-heap memory init = 35815424 
   Non-heap memory max = 123731968 
   Non-heap memory used = 18532232 
   
GARBAGE COLLECTION: 
   name = Copy 
   collection count = 15 
   collection time = 47 
   mpool name = Eden Space 
   mpool name = Survivor Space
		
   name = MarkSweepCompact 
      collection count = 0 
      collection time = 0 
		
      mpool name = Eden Space 
      mpool name = Survivor Space 
      mpool name = Tenured Gen 
      mpool name = Perm Gen 
      mpool name = Perm Gen [shared-ro] 
      mpool name = Perm Gen [shared-rw]
```

## 监控Tomcat

为了监视tomcat，在启动tomcat时应设置以下参数 -

```powershell
set JAVA_OPTS = -Dcom.sun.management.jmxremote 
Dcom.sun.management.jmxremote.port = 9004
 
-Dcom.sun.management.jmxremote.authenticate=false 
Dcom.sun.management.jmxremote.ssl = false
```

以下代码使用JMX发现正在运行的Tomcat中的可用**MBean**，确定哪些是Web模块并提取每个Web模块的处理时间。

```groovy
import groovy.swing.SwingBuilder
  
import javax.management.ObjectName 
import javax.management.remote.JMXConnectorFactory as JmxFactory 
import javax.management.remote.JMXServiceURL as JmxUrl 
import javax.swing.WindowConstants as WC 
 
import org.jfree.chart.ChartFactory 
import org.jfree.data.category.DefaultCategoryDataset as Dataset 
import org.jfree.chart.plot.PlotOrientation as Orientation 
 
def serverUrl = 'service:jmx:rmi:///jndi/rmi://localhost:9004/jmxrmi' 
def server = JmxFactory.connect(new JmxUrl(serverUrl)).MBeanServerConnection 
def serverInfo = new GroovyMBean(server, 'Catalina:type = Server').serverInfo 
println "Connected to: $serverInfo" 
 
def query = new ObjectName('Catalina:*') 
String[] allNames = server.queryNames(query, null) 

def modules = allNames.findAll { name -> 
   name.contains('j2eeType=WebModule') 
}.collect{ new GroovyMBean(server, it) }
  
println "Found ${modules.size()} web modules. Processing ..." 
def dataset = new Dataset() 
 
modules.each { m ->
   println m.name()
   dataset.addValue m.processingTime, 0, m.path 
}
```

# Groovy JSON

本章介绍了如何使用Groovy语言来解析和生成JSON对象。

## JSON功能

| 功能        |                              库                              |
| :---------- | :----------------------------------------------------------: |
| JsonSlurper | JsonSlurper是一个将JSON文本或阅读器内容**解析**为Groovy数据的类结构，例如地图，列表和原始类型，如整数，双精度，布尔和字符串。 |
| JsonOutput  |        此方法负责将Groovy对象**序列化**为JSON字符串。        |

## 使用JsonSlurper解析数据

JsonSlurper是一个将JSON文本或阅读器内容解析为Groovy数据结构的类，如地图，列表和原始类型，如Integer，Double，Boolean和String。

### 句法

```groovy
def slurper = new JsonSlurper()
```

JSON slurper将文本或阅读器内容解析为列表和地图的数据结构。

JsonSlurper类自带了一些用于解析器实现的变体。有时，在解析某些字符串时，您可能有不同的要求。让我们举一个例子，其中需要读取从Web服务器的响应返回的JSON。在这种情况下，使用解析器JsonParserLax变量是有益的。此parsee允许在JSON文本中的注释以及没有引号字符串等。要指定此类型的解析器，您需要在定义JsonSlurper的对象时使用JsonParserType.LAX解析器类型。

让我们看下面这个例子。示例是使用http模块从Web服务器获取JSON数据。对于这种类型的遍历，最好的选择是将解析器类型设置为**JsonParserLax**变体。

```groovy
http.request( GET, TEXT ) {
   headers.Accept = 'application/json'
   headers.'User-Agent' = USER_AGENT
	
   response.success = { 
      res, rd ->  
      def jsonText = rd.text 
		
      //Setting the parser type to JsonParserLax
      def parser = new JsonSlurper().setType(JsonParserType.LAX)
      def jsonResp = parser.parseText(jsonText)
   }
}
```

类似地，以下附加的解析器类型在Groovy中可用 -

- JsonParserCharArray解析器基本上采用一个JSON字符串并对底层字符数组进行操作。在值转换期间，它复制字符子数组（称为“斩波”的机制）并单独操作它们。
- JsonFastParser是JsonParserCharArray的一个特殊变体，是最快的解析器。JsonFastParser也称为索引覆盖解析器。在解析给定的JSON字符串期间，它尽可能努力地避免创建新的字符数组或String实例。它只保留指向底层原始字符数组的指针。此外，它会尽可能晚地推迟对象创建。
- JsonParserUsingCharacterSource是一个非常大的文件的特殊解析器。它使用一种称为“字符窗口化”的技术来解析具有恒定性能特征的大型JSON文件（大型意味着超过2MB大小的文件）。

### 文本解析

让我们来看看一些如何使用JsonSlurper类的例子。

```groovy
import groovy.json.JsonSlurper 

class Example {
   static void main(String[] args) {
      def jsonSlurper = new JsonSlurper()
      def object = jsonSlurper.parseText('{ "name": "John", "ID" : "1"}') 
		
      println(object.name);
      println(object.ID);
   } 
}
```

在上面的例子中，我们是 -

- 首先创建JsonSlurper类的一个实例
- 然后我们使用JsonSlurper类的parseText函数来解析一些JSON文本。
- 当我们获取对象时，您可以看到我们实际上可以通过键访问JSON字符串中的值。

以上程序的输出如下 -

```powershell
John 
1
```

### 解析整数列表

让我们来看看另一个JsonSlurper解析方法的例子。在下面的示例中，我们将列出整数列表。你会注意到下面的代码，我们可以使用每个的List方法，并传递一个闭包。

```groovy
import groovy.json.JsonSlurper 
class Example {
   static void main(String[] args) {
      def jsonSlurper = new JsonSlurper()
      Object lst = jsonSlurper.parseText('{ "List": [2, 3, 4, 5] }')
      lst.each { println it }
   } 
}
```

以上程序的输出如下 -

```powershell
List=[2, 3, 4, 5]
```

### 解析基本数据类型列表

JSON解析器还支持字符串，数字，对象，true，false和null的原始数据类型。 JsonSlurper类将这些JSON类型转换为相应的Groovy类型。

以下示例显示如何使用JsonSlurper解析JSON字符串。在这里，您可以看到JsonSlurper能够将各个项目解析为各自的基本类型。

```groovy
import groovy.json.JsonSlurper 
class Example {

   static void main(String[] args) {
      def jsonSlurper = new JsonSlurper()
      def obj = jsonSlurper.parseText ''' {"Integer": 12, "fraction": 12.55, "double": 12e13}'''
		
      println(obj.Integer);
      println(obj.fraction);
      println(obj.double); 
   } 
}
```

以上程序的输出如下 -

```powershell
12 
12.55 
1.2E+14 
```

## JsonOutput

现在让我们谈谈如何在Json中打印输出。这可以通过JsonOutput方法来完成。此方法负责将Groovy对象序列化为JSON字符串。

### 句法

```groovy
Static string JsonOutput.toJson(datatype obj)
```

**参数** -参数可以是数据类型的对象 - 数字，布尔，字符，字符串，日期，地图，闭包等。

**返回类型** -返回类型是一个JSON字符串。

### 例子

以下是如何实现这一点的简单示例。

```groovy
import groovy.json.JsonOutput 
class Example {
   static void main(String[] args) {
      def output = JsonOutput.toJson([name: 'John', ID: 1])
      println(output);  
   }
}
```

以上程序的输出如下 -

```powershell
{"name":"John","ID":1}
```

JsonOutput也可以用于普通的旧Groovy对象。在下面的示例中，您可以看到我们实际上是传递Student类型的对象到JsonOutput方法。

```groovy
import groovy.json.JsonOutput  
class Example {
   static void main(String[] args) {
      def output = JsonOutput.toJson([ new Student(name: 'John',ID:1),
         new Student(name: 'Mark',ID:2)])
      println(output);  
   } 
}
 
class Student {
   String name
   int ID; 
}
```

以上程序的输出如下 -

```powershell
[{"name":"John","ID":1},{"name":"Mark","ID":2}]
```