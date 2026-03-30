class user{
    String name;
    int id;
    user(String name,int id){
        this.name=name;
        this.id=id;
    }
}
public class SearchInListOfObjects {
public static int Search(user users[],int id){
    for(int i=0; i<users.length;i++){
        if(users[i].id==id)
            return i;
    }
    return -1;
}
    public static void main(String[] args) {
        user users[]={
            new user("Gagan",1),
            new user("Prajapati",2),
            new user("Gagan Prajapati",3)
        };
        int id=1;
        int ans=Search(users,id);
        if(ans==-1){
            System.out.println("user not found");
        }
        else{
            System.out.println("user found at index:"+ans);
            System.out.println("Name: " + users[ans].name);
        }
    }
    
}
