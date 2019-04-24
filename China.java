public class China{
    public static void main(String args[]){
        province pro=new province(1,"河北");
        city cy=new city(20,"北京");
        city cy2=new city(30,"福州");
        cy.setPri(pro);
        cy2.setPri(pro);
        pro.setCities(new city[]{cy,cy2});
        System.out.println(cy.getInfo());
        System.out.println(cy.getPri().getInfo());
        for(int x= 0 ; x<pro.getCities().length; x++){
            System.out.println(pro.getCities()[x].getInfo());
        }
    }
}
class province{
    private int pid;
    private String name;
    private city cities[];
    public province(int pid , String name){
        setPid(pid);
        setName(name);
    }
    public String getInfo(){
        return "省份编号为："+ this.pid + "，名称是："+ this.name;
    }
    public void setCities(city cities[]){
        this.cities=cities;
    }
    public city[] getCities(){
        return this.cities;
    }
    public void setPid (int pid){
        this.pid=pid;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getPid(){
        return this.pid;
    }
    public String getName(){
        return this.name;
    }
}
class city{
    private int cid;
    private String name;
    private province pri;
    public city(int cid , String name){
        setCid(cid);
        setName(name);
    }
    public String getInfo(){
        return "城市编号为： "+ this.cid + "，名称是："+ this.name;
    }
    public void setPri(province pri){
        this.pri=pri;
    }
    public province getPri(){
        return this.pri;
    }
    public void setCid(int cid){
        this.cid=cid;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getCid(){
        return this.cid;
    }
    public String getName(){
        return this.name;
    }
}