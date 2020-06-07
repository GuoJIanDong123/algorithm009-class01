一、递归的实现、特性及思维特点

   1、数的面试题解法一般都是递归原因是1)树的节点定义都是二叉树   2）树本事的结构遍历有重复性(自相似性)
   
    
    实例代码：
         def preorder(self,root):
            if root:
               self.traverse_path.append(root.val)
               self.preorder(root.left)
               self.preorder(root.right)
           
           def inorder(self,root):
               if root:
               self.inorder(root.left)
               self.traverse_path.append(root.val)
               self.inorder(root.right)
               
            def postorder(self,root):
               if root:
                self.postorder(root.left)
                self.postorder(root.right)
                self.traverse_path.append(root.val)
   
     2、递归Recusrsion
        
        递归本质是循环，和一般意义的循环的区别是通过函数体来进行循环
        举例类似盗梦空间，找到归去来兮的感觉，每进入一个世界，自身的条件或者数据会受到影响，带着新的数据进入环境，但环境不受影响。
        计算n!
        def Factorial(n):
           if n <=1:
               return 1
           return n*Factorial(n-1)
           
           
     3、递归模板
         def  recursion(level,param1,param2,......):
             # recursion terminator
             if level > MAX_LEVEL:
                 process_result
                 return
              
              
              #process logic in current level   处理当前层的逻辑
              process(level,data......)
              
              #drill down  下一层
              self.recursion(level+1,p1,p2.....)
              
              # revere the current level status if needed
              
      4、思维要点
      
         1）不要人肉递归
         2）找到最近最简单的方法，将其拆解成可重复解决的问题(重复子问题)
            条件一，我们使用的方法是ifelse,for/loop/while以及递归三种方法
            思考问题后的解决方法的逻辑很复杂，要求是最多二三十行代码可以解决，
            肯定会存在可重复项，循环或者递归两种情况，解决的关键是找到可重复项
            
         3）数学归纳法思维
             最开始说n = 1,n=2的时候成立的，且n成立n+1也是成立的
             
             
  二、分治、回溯的实现和特性
  
      分治和回溯本质也是一种递归
      重复性，有最近的重复性和最优的重复性，最优的就是动态规划，最近重复性根据怎么分解有回溯分治或者其他的一些方法本质是一种递归，也就是找他的重复性
      
            
            
       
        
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
