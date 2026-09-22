
class Triangle 
{
    double base,height,area;
    String color;
    void setBase(double b)
    {
        base = b;
    }
    void setHeight(double h)
    {
        height = h;
    
    }

    void setcolor(String c)
    {
      color = c;
    }

     double getBase()
     {
        return base;
     }
     String getcolor()
{
      return color;
}
void compute_area()
{
    area=0.5*base*height;
}

public static void main (String args[])

{
    Triangle t1= new Triangle();
    Triangle t2 = new Triangle();

t1.setBase(10);
t1.setHeight(5);
t1.setcolor("Red");
t1.compute_area();

t2.setBase(10);
t2.setHeight(5);
t2.setcolor("Red");
t2.compute_area();

if(t1.area==t2.area && t1.color.equals(t2.color))

    System.out.println("Mathching Triangles");
    else
        System.out.println("Non matching Triangles");
}
}

