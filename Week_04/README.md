一、深度优先搜索、广度优先搜索的实现和特性
   
     遍历树的每一个节点，并且保证每个节点只遍历一次
     
  1、   public class TreeNode{
         public int val;
         public TreeNode left,right;
         public TreeNode(int val) {
              this.val = val;
              this.left = null;
              this.right = null;
         }
     }
     
    2、 树的搜索和遍历
      1） 每个节点都要访问一次
      2） 每个节点仅仅要访问一次
      3)  对于节点的访问顺序不限
          深度优先：depth first search
          广度优先： breadth first search
          优先级优先 ：现实中业务场景
          
   3、深度优先的代码
  1)    def dfs(node):
        if node in visited:
          # already visited
          return
        visited.add(node)
        # process current node
        #....#logic here
        dfs(node.left)
        dfs(node.right)
        
        
  2) visited = set()
   def dfs(node,visited):
       visited.add(node)
       
       #process current node here
       ....
       for next_node in node.children():
           if not next_node in visited:
              dfs(next node,visited)
  3)   visited = set()
       def dfs(node,visited):
          if node in visited:  # terminal
             #already visited
             return
           visited.add(node)
           
           #process currenti node here
           
           for  next_node in node.children():
               if not next_node in visited:
                   dfs(next_node,visited)
                   
      4)  def  DFS(self,tree):
              if tree.root is None:
                  return []
               visited,stack = [],[tree.root]
               
               while stack:
                   node = stack.pop()
                   visited.add(node)
                   
                   process(node)
                   
                   nodes = generate_related_nodes(node)
                   stack.push(nodes)
                # other processing work
                   
     4、 广度优先遍历
        
           def  DFS(graph,start,end):
              queue = []
              queue.append([start])
              visited.add(start)
              
            while queue:
               node = queue.pop()
               visited.add(node)
               
               process(node)
               nodes = generate_related_nodes(node)
               queue.push(nodes)
               
           # other processing work
           
      二、贪心算法
         1、贪心算法是一种在每一步选择中都采取当前状态最好或者最优（最有利）的选择，从而希望导致结果全局最好或最优的算法 
          贪心算法与动态规划的不同在于它对每个子问题的解决方案都做出选择，不能回退，动态规划则会保留之前的运算结果，并根据以前的结果对当前进行选择
          有回退功能。
         2 、贪心法可以解决一些最优化问题，如求图中的最小生成树，求哈夫曼编码，然而对于工程和生活问题，贪心算法一般不能得到我们所要求的答案。
          一旦一个问题可以通过贪心算法来解决，那么贪心算法一般就是解决这个问题的最优解，贪心法也可以用作辅助算法或者直接解决一些要求不是特别精确
          的问题
         3、适用贪心算法的场景
           简单说，问题能够分解成子问题来解决，子问题的最优解能递推到最终问题的最优解。这种子问题的最优解称为最优子结构
           
           贪心算法与动态规划的不同在于，它对每个子问题的解决方案都做出选择，不能回退，动态规划则会保存以前的运算结果，并根据以前的结果对当前进行选           择，有回退功能。
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
           
           
           
           
           
           
           
           
