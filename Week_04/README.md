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
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
           
           
           
           
           
           
           
           
