public class Dept{
    public static void main(String args[]){
        //设置数据
        //产生各自的独立对象
        Dept1 dept=new Dept1(18,"财务部","北京");//部门信息
        Emp ea=new Emp(19,"张三","技术员",100,5);//雇员信息
        Emp eb=new Emp(20,"李四","客服",200,6);//雇员信息
        Emp ec=new Emp(21,"王五","领导",300,7);//雇员信息
        //设置雇员和领导的关系
        ea.setMgr(ec);
        eb.setMgr(ec);
        //设置雇员和部门关系
        ea.setDept1(dept);
        eb.setDept1(dept);
        ec.setDept1(dept);
        dept.setEmp(new Emp[]{ea,eb,ec});
        //取出数据
        //通过雇员找到领导信息和部门信息
        System.out.println(eb.getMgr().getInfo());//取出eb的领导信息
        System.out.println(eb.getInfo());//取出eb信息
        System.out.println(eb.getDept().getInfo());//取出eb部门信息
        System.out.println("------------------------------------");
        System.out.println(dept.getInfo());//调取部门数据
        for (int x=0; x<dept.getEmp().length ;x++){
            System.out.println(dept.getEmp()[x].getInfo());
        }
        for (int x=0; x<dept.getEmp().length ;x++){
            if(dept.getEmp()[x].getMgr()!=null){
                System.out.println("职员名称"+dept.getEmp()[x].getInfo()+"，领导是"+dept.getEmp()[x].getMgr().getInfo());  
            }
        }
    }
}
class Dept1{
    private int depto;
    private String dname;
    private String loc;
    private Emp emp[];
    public void setEmp(Emp emp[]){
        this.emp=emp;
    }
    public Emp[] getEmp(){
        return this.emp;
    }
    public Dept1(int depto , String dname ,String loc){
        this.depto=depto;
        this.dname=dname;
        this.loc=loc;
    }
    public String getInfo(){
        return "部门编号"+ this.depto +"，名称"+ this.dname +"，定位"+ this.loc;
    }
    public void setDepto(int depto){
        this.depto=depto;
    }
    public void setDname(String dname){
        this.dname=dname;
    }
    public void setLoc(String loc){
        this.loc=loc;
    }
    public int getDepto(){
        return this.depto;
    }
    public String getDname(){
        return this.dname;
    }
    public String getLoc(){
        return this.loc;
    }
}
class Emp{
    private int empno;
    private String ename;
    private String job;
    private double sal;
    private double comm;
    private Emp mgr;
    public void setMgr(Emp mgr){
        this.mgr=mgr;
    }
    public Emp getMgr(){
        return this.mgr;
    }
    private Dept1 dept;  //雇员中保存表示对应的部门信息；
    public void setDept1(Dept1 dept){
        this.dept=dept;
    }
    public Dept1 getDept(){
        return this.dept;
    }
    public Emp(int empno, String ename, String job, double sal, double comm){
        this.empno=empno;
        this.ename=ename;
        this.job=job;
        this.sal=sal;
        this.comm=comm;
    }
    public String getInfo(){
        return "雇员编号"+ this.empno+ "，雇员名字"+ this.ename +"，职位" + this.job +"，薪资"+ this.sal +"，佣金"+this.comm;
    }
    public void setEmpno(int empno){
        this.empno=empno;
    }
    public void setEname(String ename){
        this.ename=ename;
    }
    public void setJob(String job){
        this.job=job;
    }
    public void setSal(double sal){
        this.sal=sal;
    }
    public void setComm(double comm){
        this.comm=comm;
    }
    public int getEmpno(){
        return this.empno;
    }
    public String getEname(){
        return this.ename;
    }
    public String getJob(){
        return this.job;
    }
    public double getSal(){
        return this.sal;
    }
    public double getComm(){
        return this.comm;
    }
}