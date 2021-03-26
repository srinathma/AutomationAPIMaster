package GetPortCall;


public class Compliance
{
private String deadlineTimeStamp;

private String id;

private String type;

private String brand;

public String getDeadlineTimeStamp ()
{
return deadlineTimeStamp;
}

public void setDeadlineTimeStamp (String deadlineTimeStamp)
{
this.deadlineTimeStamp = deadlineTimeStamp;
}

public String getId ()
{
return id;
}

public void setId (String id)
{
this.id = id;
}

public String getType ()
{
return type;
}

public void setType (String type)
{
this.type = type;
}

public String getBrand ()
{
return brand;
}

public void setBrand (String brand)
{
this.brand = brand;
}

@Override
public String toString()
{
return "ClassPojo [deadlineTimeStamp = "+deadlineTimeStamp+", id = "+id+", type = "+type+", brand = "+brand+"]";
}
}


