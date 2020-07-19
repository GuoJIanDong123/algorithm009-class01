# 一、高级动态规划
## 1、复习递归--函数自己调用自己
```Java
public void recur(int levle,int param){
  //terminator
  if(level>MAX_LEVEL){
    //process result
    return;
  }
  
  //process current logic
  process(level,param);
  //drill down
  recur(leve:level+1,newParam);
  
  //restore current status

}
```
## 2、分治--分而治之
```Python
def divide_conquer(problem,param1,param2,...):
  #recursion terminator
  if problem in None:
    print result
    return
  # prepare data
  data = prepare_data(problem)
  subproblems = split_problem(problem,data)
  #conquer subproblems
  subresult1 = self.divide_conquer(subproblem[0],p1,...)
  subresult2 = self.divide_conquer(subproblem[1],p1,...)
  subresult3 = self.divide_conquer(subproblem[2],p1....)
  .....
  #process and generate the final result
  result = process_result(subresult1,subresult2,subresult3,...)
  # revert the current level states
```
## 3、总结
- 人肉递归低效
- 找到最近最简方法，将其拆解成可重复解决的问题
- 数学归纳法思维
- 本质：寻找重复性--》计算机指令集
## 4、动态规划 Dynamic Programming
- Simplifying a complicated problem by breaking it down into simpler sub-problems
- Divide & Conquer +Optimal substructure(分治+最优子结构)
- 顺推形式：动态递归
## 5、DP顺推模板
```python
function DP():
  dp = [][] #二维情况
  for i = 0...M{
    for j=0...N{
      dp[i][j] = _Function(dp[i'][j'])
    }
  }
  return dp[M][N]
```
## 6、DP关键点
- 动态规划和递归或者分治没有根本上的区别(关键看有无最优子结构)
- 拥有的共性：找到重复子问题
- 差异性：最优子结构，中途可以淘汰次优解

## 7、爬楼梯问题
- 递归公式 f(n) = f(n-1) + f(n-2),f(1)=1,f(0) = 0
```
#时间复杂度O(2^n)
def f(n):
  if n<=1:return 1
  return f(n-1)+f(n-2)
#时间复杂度O(n)
def f(n):
  if n<=1:return 1
  if n not in mem:
    mem[n] = f(n-1)+f(n-2)
   return mem[n]
# 时间复杂度O(n)
def f(n):
  dp = [1]*(n+1)
  for i in range(2,n+1):
    dp[i] = dp[i-1]+dp[i-2]
  return dp[i]
  
 def f(n):
  x,y = 1,1
  for i in range(1,n)
   y,x = x+y,y
  return y
```
# 二、字符串算法
## 1、字符串基础知识
 - Python：x ='abcd'   x="abcd"
 - Java:String x = "abbc"
 - C++:string x("abcd")
## 2、遍历字符串
 - Python：
 ```Python
 for ch in "abbc":
   print(ch)
 ```
 ```Java:
 String x = "abbc";
 for(int i=0;i<x.size();++i){
    char ch = x.charAt(i);
 }
 for ch in x.toCharArray(){
    System.out.println(ch);
 }
 ```
 ```C++
 string x("abbc")
 for(int i=0;i<s1.length();i++){
    cout<<x[i];
 }
 ```
 ## 3、字符串比较
 ```Java
 String x = new String("abb");
 String y = new String("abb");
 x==y -->false
 x.equals(y) -->true
 
 ## 4、字符串转数字
 ```Java
 public int myAtoi(String str){
   int index = 0,sign = 1,total = 0;
   //1.Empyty string
   if(str.length()==0) return 0;
   //2.Remove spaces
   while(str.charAt(index)==' ' && index< str.length()) index++;
   //3.Handle signs
   if(str.charSt(index)=='+' || str.charAt(index)=='-'){
      sign = str.charAt(index) =='+'?1:-1;
      index ++;
   }
   //4.convert number and avoid overflow
   while(index <str.length()){
      int digit = str.charAt(index) - '0';
      if(digit<0 || digit>9) break;
      if(Intger.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE%10 < digit)
          return sign == 1?Integer.MAX_VALUE:Integer.MIN_VALUE;
       total = 10 * total +digit;
       index++
   }
   
   return total*sign;
 }
 ```
 ## 5、字符串匹配算法
 - 暴力法
 ```Java
 public static int forceSearch(String txt,String pat){
    int M = txt.length();
    int N = pat.length();
    for (int i = 0;i<M;i++){
      int j;
      for(j=0;j<N;j++){
        if(txt.charAt(i+j)!=pat.charAt(j)){
            break;
        }
      }
       if(j==N){
         return i;
      }
    }
    return -1;
 }
 ```
 - Rabin-Karp算法
    - 假设子串的长度为M(pat),目标字符串的长度N(txt)
    - 计算子串的hash值hash_pat
    - 子串目标字符串txt中每个长度为M的子串的hash值计算(N-M+1)次
    - 比较hash值：如果hash值不同，字符串必然不匹配；如果hash值相同，还需用朴素算法再匹配
    
 - KMP算法
