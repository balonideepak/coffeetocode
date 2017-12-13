package ds.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

import ds.tree.LinkedListToTreeConversion.TreeNode;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        
        TreeNode temp=null;
        int size=0;
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        while(true){
        size=queue.size();
            
            if(size==0){
                break;
            }
            
         while(size > 0){
           
           }
            
            Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
            for (Entry<Integer, Integer> entry : entrySet) { 
            if (entry.getValue() %2 !=0) { 
             return false;
            } 
            }


          
        
        map.clear();
        
       }
        
        return true;
    }
}