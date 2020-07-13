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
