## 学习总结
### 一、内容回顾
#### 1、数据结构
- 一维
   - 基础：数组array(String),链表linked list
   - 高级：栈stack,队列 queue,双端队列dequeue,集合 set,映射map(hash or map),etc
- 二维
   - 基础：树 tree,图 graph
   - 高级：二叉搜索树 binary search tree(red-black tree,avl)堆heap,幷查集disjoint set,字典树 Trie,etc
- 特殊：
   - 位运算Bitwise,布隆过滤器 BloomFilter
   - LRU Cache
### 2、算法
- if-else,switch-->branch
- for,while loop-->Iteration
- 递归 Recursion(Divide & Conquer,Bachtrack)
- 搜索 Search：深度优先搜索Depth first search,广度优先搜索 Breadth first search,A*,etc
- 动态规划 Dynamic Programming
- 二分查找 Binary Search
- 贪心 Greedy
- 数学Math，几何Geometry
记住每种算法的思想和代码模板
### 二、代码模板
#### 1、递归
```Python
def recursion(level,param1,param2,....):
  # recursion terminator
  if level > MAX_LEVEL:
     process_result
     return
  # process logic in current level
  process(level,data...)
  
  # drill down
  self.recursion(level+1,p1,...)
  
  # reverse the current level status if needed
```
#### 2、分治模板
```Python
def divide_conquer(problem,param1,param2,...):
  # recursion terminator
  if problem is None:
     print_result
     return
  # prepare data
  data = prepare_data(problem)
  subproblems = split_problem(problem,data)
  
  # conquer subproblem
  subresult1 = self.divide_conquer(subproblem[0],p1,...)
  subresult2 = self.divide_conquer(subproblem[1],p1,...)
  subresult3 = self.divide_conquer(subproblem[2],p1,...)
  
  # process and generate the final result
  result = process_result(subresult1,subresult2,subresult2,...)
  
  # revert the current level states
  
  ```
  #### 3、DFS
  ##### 递归写法
  ```python
  visited = set()
  def dfs(node,visited):
     if node in visited: # terminator
         # already visited
         return
      visited.add(node)
      # process current node here.
      ...
      for next_node in node.children():
          if not next_node in visited:
              dfs(next_node,visited)
  ```
  ##### 非递归写法
  ```Python
  dfs DFS(self,tree):
      if tree.root is None:
          return []
      visited,stack = [],[tree.root]
      while stack:
          node = stack.pop()
          visited.add(node)
          process(node)
          nodes = generate_related_nodes(node)
          stack.push(nodes)
  
  ```
  
  #### 4、BFS模板
  ```Python
  def BFS(graph,start,end):
     visited = set()
     queue = []
     while queue:
         node = queue.pop()
         visited.add(node)
         process(node)
         nodes = generate_related_nodes(node)
         queue.push(nodes)
     # other processing work
 ```
 ### 三、解题思想
 #### 1、化繁为简的思想
 - 找到最近最简方法，将其拆解为可重复计算的问题
 - 数学归纳法思维
 - 本质：寻找重复性 --》计算机指令
 #### 2、学习要点
 - 基本功是区别业务和职业选手的根本，深厚的功底来自于过遍数
 - 最大的误区：只做一遍
 - 五毒神掌
 - 刻意联系-练习缺陷弱点地方，不舒服，枯燥
 - 反馈-看题解、看国际版的高票回答
 
 ### 四、面试
- 面试代码会很短20-30之间
- Clarification:明确题目的意思、边界、数据规模
- POSSible solutions:穷尽所有可能的解法
   - compare time/space
   - optional solution
- coding:代码简介、高性能、美感
- Test cases
 
 
  
  
  
