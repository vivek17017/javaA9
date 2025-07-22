package assignments;

public class A9 {
    public void driver()
    {
        Circle1 c1=new Circle1();
        c1.setRadius(4.0);
        Double d= c1.getCircumference();
        System.out.println("circumference is : "+d);
    }

}
class Circle1{
    private Double radius;
    Double r=radius;
    public void setRadius(Double r)
    {
        this.r=r;
    }
    public Double getRadius(){return r;}
    public Double getArea(){return 3.14*r*r;}
    public Double getCircumference(){return 3.14*2*r;}



}
class MarkSheet{
    private Integer physics,mathematics,chemistry,hindi,english;

    public Integer getPhysics() {
        return physics;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public Integer getMathematics() {
        return mathematics;
    }

    public void setMathematics(Integer mathematics) {
        this.mathematics = mathematics;
    }

    public Integer getChemistry() {
        return chemistry;
    }

    public void setChemistry(Integer chemistry) {
        this.chemistry = chemistry;
    }

    public Integer getHindi() {
        return hindi;
    }

    public void setHindi(Integer hindi) {
        this.hindi = hindi;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }
    public Integer maximumMarks(){
        Integer max=0;
        if(max<physics)
            max=physics;
        if(max<mathematics)
            max=mathematics;
        if(max<chemistry)
            max=chemistry;
        if(max<hindi)
            max=hindi;
        if(max<english)
            max=english;
        return max;
    }
    public Double averageMarks()
    {
        return (physics+mathematics+english+hindi+chemistry)/5.0;
    }
    public boolean result(Integer passingMarks){
        Boolean result=true;
        if(physics<passingMarks)
            result=false;
        if(mathematics<passingMarks)
            result=false;
        if(chemistry<passingMarks)
            result=false;
        if (hindi<passingMarks)
            result=false;
        if(english<passingMarks)
            result=false;
        return result;
    }
}