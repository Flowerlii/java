public class Control{               //just begin!
    public static void main(String args[]){
        Admin ad= new Admin("ID1","123456");
        Admin ad1= new Admin("ID12","789");
        Admin ad2= new Admin("ID13","000");
        Role rl= new Role(1,"程序员");
        Role rl1= new Role(2,"美工");
        Group gp= new Group(11,"所有权限");
        Group gp1= new Group(22,"部分权限");
        Action ac= new Action(111,"都管","程序员路径");
        Action ac1= new Action(222,"部分管","美工路径");
        ad.setRole(rl);
        ad1.setRole(rl);
        ad2.setRole(rl1);
        rl.setAdmin(new Admin[]{ad,ad1} );
        rl1.setAdmin(new Admin[]{ad2} );   //一个程序员角色对应多个管理员
        gp.setRole(new Role[]{rl,rl1});
        rl1.setGroup(new Group[]{gp1});
        gp.setAction(new Action[]{ac,ac1});
        gp1.setAction(new Action[]{ac1});
        ac.setGroup(gp);
        ac1.setGroup(gp1);
        System.out.println(ad2.getRole().getInfo());
        for(int x=0;x<rl.getGroup().length;x++){
            System.out.println(rl.getGroup()[x].getInfo());
        }
        for(int x=0;x<ad.getRole().getGroup().length;x++){              //数据的传递只是单向，没有写关系方法的均无法查询，也无法跨级查询,多级查询只能多个方法连续调用
            System.out.println(ad.getRole().getGroup()[x].getInfo());   //如果要跨级需要完善代码中的private;
        }




    }
}
class Admin{
    private String aid;
    private String password;
    private Role role;
    public Admin(String aid, String password){
        setAid(aid);
        setPassword(password);
    }
    public String getInfo(){
        return "您的管理员ID是： "+this.aid + "您的密码是： "+ this.password;
    }
    public void setAid(String aid){
        this.aid=aid;
    }
    public String getAid(){
        return this.aid;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setRole(Role role){
        this.role=role;
    }
    public Role getRole(){
        return this.role;
    }

}
class Role{
    private int rid;
    private String title;
    private Admin admin[];
    private Group group[];
    public Role(int rid, String title){
        setRid(rid);
        setTitle(title);
    }
    public String getInfo(){
        return "您的角色ID是： "+ this.rid+ "名称是： "+ this.title;
    }
    public void setRid(int rid){
        this.rid=rid;
    }
    public int getRid(){
        return this.rid;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setAdmin(Admin admin[]){
        this.admin=admin;
    }
    public Admin[] getAdmin(){
        return this.admin;
    }
    public void setGroup(Group group[]){
        this.group=group;
    }
    public Group[] getGroup(){
        return this.group;
    }
}
class Group{
    private int gid;
    private String title;
    private Role role[];
    private Action action[];
    public Group(int gid ,String title){
        setGid(gid);
        setTitle(title);
    }
    public String getInfo(){
        return "您的权限组ID是： "+ this.gid +"名称是： "+ this.title;
    }
    public void setGid(int gid){
        this.gid=gid;
    }
    public int getGid(){
        return this.gid;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setRole(Role role[]){
        this.role=role;
    }
    public Role []getRole(){
        return this.role;
    }
    public void setAction(Action action[]){
        this.action=action;
    }
    public Action [] getAction(){
        return this.action;
    }
}
class Action{
    private int aid;
    private String title;
    private String url;
    private Group group;
    public Action (int aid ,String title,String url){
        setAid(aid);
        setTitle(title);
        setUrl(url);
    }
    public String getInfo(){
        return "您的管理权限ID是： "+ this.aid + "名称是： "+ this.title + "路径是： "+ this.url;
    }

    public void setAid(int aid){
        this.aid=aid;
    }
    public int getAid(){
        return this.aid;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setUrl(String url){
        this.url=url;
    }
    public String getUrl(){
        return this.url;    
    }
    public void setGroup( Group group){
        this.group=group;
    }
    public Group getGroup(){
        return this.group;
    }
}