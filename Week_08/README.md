# 一、位运算
## 1、位运算符
#### 1）为什么需要位运算
- 机器里的数字表示方式和存储^格式就是二进制
- 余数短除法除以二
#### 2）位运算符
- 左移  运算符是  <<    示例  0011=>0110
- 右移  运算符   >>  正数右移高位补0，负数右移高位补1 示例 0110=> 0011   或 |， 与 & ，取反 ~
- 右移  无符号运算符 >>> 无论是正数还是负数，高位通通补0。
- XOR-异或 
   - 异或：相同为0，不同为1.也可以用“不进位加法”来理解
   - x^0 = x
   - x^1s= ~x //注意 1s = ~0
   - x^(~x) = 1s
   - x^x = 0
   - c = a^b => a^c=b,b^c = a //交换两个数
   - a^b^c = a^(b^b) = (a^b)^c //associative


## 2、算位运算与逻辑移位
- 指定位置的位运算
   - 将x最右边的n位清零：x&(~0<<n)
   - 获取x的第n位值（0或者1）：(x>>n)&1
   - 获取x的第n位的幂值： x&(1<<n)
   - 仅将第n位置为1：x|(1<<n)
   - 仅将第n位置为0：x|(~(1<<n))
   - 将x最高位至第n 位(含)清零：x&((1<<n)-1)
## 3、位运算的应用

- 判断奇偶数
   - x%2==1 -> (x&1)==1
   - x%2==0 -> (x&1) ==0
- x>>1 -> x/2
   - 即：x = x/2; -> x = x>>1;
   - mind = (left+right)/2; -> mid =(left+right)>>1
- x = x&(x-1) 清零最低位的1
- x&-x =>得到最低位的1

# 二、布隆过滤器
## 1、Hash表结构图
![hash结构](https://github.com/GuoJIanDong123/algorithm009-class01/blob/master/Week_08/HashTable.png)

## 2、Bloom Filter vs Hash Table
- 一个是很长的二进制向量和一系列随机映射函数。布隆过滤器可以用于检索一个元素是否存在一个集合中
- 优点是空间效率和查询时间都远远超过一般的算法
- 缺点是有一定的误识别率和删除困难
## 3、案例
- 比特币网络
- 分布式系统
- Redis缓存
- 垃圾邮件、评论等的过滤
## 4、过滤器实现
```Python
from bitarray import bitarray
import mmh3
class BloomFilter:
   def __init__(self,size,hash_num)：
      self.size = size
      self.hash_num = hash_num
      self.bit_array = bitarray(size)
      self.bit_array .setall(0)
      
    def add(self,s):
      for seed in range(self.hash_num):
         result = mmh3.hash(s,seed)%self.size
         self.bit_array[result] = 1
    def lookup(self,s):
       for seed in range(self.hash_num):
         result = mmh3.hash(s,seed) % self.size
         if self.bit_array[result] ==0
            return 'Nope'
        return 'Probably'
 bf = BloomFilter(500000,7)
 bf.add("dantezhao")
 print(bf.lookup("dantezhao"))
 print(bf.lookup("yyj))
 ```
 
 # 三、LRU Cache
 ## 1、LRU Cache的特性
 - 两个要素：大小、替换策略
    - LFU-least frequently used
    - LRU-least recently used
 - 实现Hash Table + Double LinkedList
 -O(1)查询  O(1)修改、更新
 
 # 四、排序算法
 ## 1、分类
 - 比较类排序
    - 通过比较来决定元素间的相对次序，由于其时间复杂度不能突破O(nlogn),因此也称为非线性时间比较类排序
    - 交换排序
       - 冒泡排序
       - 快速排序
    - 插入排序
       - 简单插入排序
       - 希尔排序
    - 选择排序
       - 简单选择排序
       - 堆排序
    - 归并排序
       - 二路归并排序
       - 多路归并排序
      
 - 非比较类排序
    - 不通过比较来决定元素间的相对次序，它可以突破基于比较排序的时间下界，以线性时间运行，因此也称谓线性时间非比较类排序
    - 计数排序
    - 桶排序
    - 基数排序
    
 ## 2、初级排序-O(n^2)
 - 选择排序
    - 每次找最小值，然后放到待排序数组的起始位置
 - 插入排序
    - 从前到后逐步构建有序序列；对于未排序数据，在已排序序列中从后向前扫描，找到相应的位置并插入
 - 冒泡排序(bubble sort)
    - 嵌套循环，每次查看相邻的元素如果逆序，则交换
## 3、高级排序-O(nlogn)
 - 快速排序(Quick Sort)
    - 数组取标杆pivot,将小元素放pivot左边，大元素放右侧，然后依次对右边和左边的子数组继续快排；已达到整个序列有序。
 
 - 归并排序(Merge Sort)-分治
    - 把长度为n的输入序列分成两个长度为n/2的子序列；
    - 对这两个子序列分别采用归并排序
    - 将两个排序好的子序列合并成一个最终的排序序列
    
 - 堆排序(Heap Sort) -堆插入O(logN),取最大/小值O(1)
    - 数组元素依次建立小顶堆
    - 依次取堆顶元素，并删除
      
      
      
      
      
      
      
      
      



