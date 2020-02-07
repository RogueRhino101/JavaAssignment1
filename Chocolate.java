
package chocolatedetails;


import java.util.*;
class Chocolate
{
private String ChocolateType;
private float Weight;
public Chocolate(String ChocolateType,float Weight)
{
this.ChocolateType=ChocolateType;
this.Weight=Weight;
}
public String getType()
{
    return ChocolateType;
}

public float getWeight()
{
return Weight;
}
}