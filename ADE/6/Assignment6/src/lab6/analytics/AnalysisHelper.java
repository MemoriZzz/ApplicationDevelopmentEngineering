/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lab6.entities.Comment;
import lab6.entities.Post;
import lab6.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    //  key: UserId ; Value: sum of likes from all comments
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
    
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes: " + max + "\n" 
            + users.get(maxId));
    }
    
    
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes(); // list 按照likes顺序排列
            }
        });
        
        System.out.println("5 most likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }
    
    
    public void findAverageLikePerComment(){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        int falpc = 0;
        int i = 0;
        
        System.out.println("average number of likes per comment is: ");
        for (Comment o : commentList){
            falpc = falpc + o.getLikes();
            i++;
        }
            falpc = falpc/i;
        
        System.out.println(falpc);
        
        
    }
    
    
    public void findThePostWithMostLikedComment(){
        
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes(); // list 按照likes顺序排列
            }
        });
        
        System.out.println("the post with most liked comment is (show this post's postId):");
        for (int i = 0; i < commentList.size() && i < 1; i++) {
            System.out.println(commentList.get(i).getPostId());
        }
        
    }
    
    
    
    public void findThePostWithMostComment(){
        
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getPostId() - o1.getPostId(); // list 按照post个数顺序排列（多少个人评价了这个post）
            }
        });
        
        System.out.println("the post with most comments is (show this post's postId):");
        for (int i = 0; i < commentList.size() && i < 1; i++) {
            System.out.println(commentList.get(i).getPostId());
        }  
    }
    
        public void getFiveLessComment(){
        Map<Integer, Integer> userCommentCount= new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        //ValueComparator bvc = new ValueComparator(userCommentCount);
        //TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);
        for(User u: users.values()){
            userCommentCount.put(u.getId(), u.getComments().size());
        }
        for(int i=0; i<5; i++){
            int less = 300;
            int lessId = 0;
            for(int id: userCommentCount.keySet()){
                if(userCommentCount.get(id) < less){
                    less = userCommentCount.get(id);
                    lessId = id;                
                }              
            }
            System.out.println("result: "+ users.get(lessId));
            userCommentCount.remove(lessId);
        }
}
    
    public void getFiveLessPost(){
        Map<Integer, Integer> userPostCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();        
        
            for (Post p: posts.values()){
                int countP = 0;
                if (userPostCount.containsKey(p.getUserId())) {
                countP = userPostCount.get(p.getUserId());
                }
                countP++;
                userPostCount.put(p.getUserId(), countP); System.out.println(userPostCount);
            }
            
            for(int i=0; i<5; i++){
                int less = 10;
                int lessId = 0;
                for(int id: userPostCount.keySet()){
                if(userPostCount.get(id) < less){
                    less = userPostCount.get(id);
                    lessId = id;                
                }              
            }
            System.out.println("The user "+ lessId+ " he/she post " + userPostCount.get(lessId));
           
            userPostCount.remove(lessId);
        }
            
            /* System.out.println("user 1 " + userPostCount.get(0));
            System.out.println("user 2 " + userPostCount.get(1));
            System.out.println("user 3 " + userPostCount.get(2));
            System.out.println("user 4 " + userPostCount.get(3));
            System.out.println("user 5 " + userPostCount.get(4));
            System.out.println("user 6 " + userPostCount.get(5));
            System.out.println("user 7 " + userPostCount.get(6));
            System.out.println("user 8 " + userPostCount.get(7));
            System.out.println("user 9 " + userPostCount.get(8));
            System.out.println("user 10 " + userPostCount.get(9));
            */          
        }
    public void getFiveLessLikes(){
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        Map<Integer, Comment> comment = DataStore.getInstance().getComments();
         for(User u: users.values()){
             int x=0;
           for(Comment c: comment.values()){
               if(c.getUserId()==u.getId()){x+=c.getLikes();}
            
            
        }userLikesCount.put(u.getId(), x);
                
                
               
              
            }   System.out.println(userLikesCount);
              //c.getLikes().size());
        
         
        for(int i=0; i<5; i++){
          
            int lessId = 0;
            int less = 5000;
            for(int id: userLikesCount.keySet()){  
                
                if(userLikesCount.get(id) < less){
                    less = userLikesCount.get(id);
                    lessId = id;                
                }              
            }
          System.out.println("The user "+ lessId+ " likes= " + userLikesCount.get(lessId));
            userLikesCount.remove(lessId);
          
       
        
    }
    
    }
    
    public void getFiveLessAll(){
        Map<Integer, Integer> userSumAllCount = new HashMap<>();                //userSumAllCount            
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        Map<Integer, Comment> comment = DataStore.getInstance().getComments();
        Map<Integer, Integer> userPostCount = new HashMap<>();                  //userPostCount
        Map<Integer, Integer> userCommentCount= new HashMap<>();                //userCommentCount <userId, comments数量>
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();   
        Map<Integer, Integer> userLikesCount = new HashMap<>();                 //userLikesCount
        int sum=0;
       
        for(User u: users.values()){
             
            userCommentCount.put(u.getId(), u.getComments().size());} // userCommentCount这个表中存储了<userId, comments数量>
        //Comment
         
         for (Post p: posts.values()){
                int countP = 0;
                if (userPostCount.containsKey(p.getUserId())) {
                countP = userPostCount.get(p.getUserId());
                }
                countP++;
               userPostCount.put(p.getUserId(), countP);} //userPostCount这个表中存储了 <userId, posts数量>
            //Post
        for(User u: users.values()){
             int x=0;
           for(Comment c: comment.values()){
               if(c.getUserId()==u.getId()){x+=c.getLikes();}
            }
           userLikesCount.put(u.getId(), x);} //c.getLikes().size()); 
           System.out.println(userPostCount);
           System.out.println(userCommentCount);
           System.out.println(userLikesCount);
             for(User ua: users.values()){  //
               sum=userCommentCount.get(ua.getId())+userPostCount.get(ua.getId())+userLikesCount.get(ua.getId());
               userSumAllCount.put(ua.getId(), sum);
         }System.out.println(userSumAllCount);
         
         for(int i=0; i<5; i++){
            int less = 4000;
            int lessId = 0;
            for(int id: userSumAllCount.keySet()){
                if(userSumAllCount.get(id) < less){
                    less = userSumAllCount.get(id);
                    lessId = id;                
                }              
            }
          System.out.println("The user is "+ lessId+ " most inactive with totally " + userSumAllCount.get(lessId));
          userSumAllCount.remove(lessId);
          
        
    } 
         for(int i=0; i<5; i++){
            int a =500;
            int Id = 0;
            for(int id: userSumAllCount.keySet()){
                if(userSumAllCount.get(id) > a){
                   a = userSumAllCount.get(id);
                    Id = id;                
                }              
            }
          System.out.println("The user is "+ Id+ " most active with totally " + userSumAllCount.get(Id));
          userSumAllCount.remove(Id);
          
        
    } 
       
         
         
    }
    
   
}
