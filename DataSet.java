package lab2;
/**
 * @author MA PATRICIA YRASTORZA
 * 
Computes the average and maximum of a set of data values.
*/
public class DataSet
{
private double sum; //To track the total.
private Measurable maximum; //To store the largest value.
private int count; //To track the number of values.

/**
   Constructs an empty data set.
*/
public DataSet()
{
   sum = 0;
   count = 0;
   maximum = null;
}

/**
   Adds a data value to the data set.
   @param x a data value
*/
public void add(Measurable x)
{
   sum = sum + x.getMeasure(); //Update sum by calling and adding x value to sum.
   if (count == 0 || maximum.getMeasure() < x.getMeasure())
      maximum = x; //Update max value if larger than current max. 
   count++;
}

/**
   Gets the average of the added data.
   @return the average or 0 if no data has been added.
*/
public double getAverage()
{
   if (count == 0) return 0; //No data is added.
   else return sum / count; //Average formula of all added values.
}

/**
   Gets the largest of the added data.
   @return the maximum or 0 if no data has been added.
*/
public Measurable getMaximum()
{
   return maximum; //Largest value added to the set.
}
}
