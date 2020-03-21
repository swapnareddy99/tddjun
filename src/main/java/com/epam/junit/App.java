package com.epam.junit;

/**
 * Hello world!
 *
 */
public class App 
{
    public String swap( String res )
    {
    	int x=res.length();
    	int y=res.charAt(0);
    	int z=res.charAt(1);
    	if(y=='A' && z!='A')
    	{
    	res=res.substring(1,x);
    	}
    	else if(y=='A' && z=='A')
    	{
    		res=res.substring(2, x);
    	}
    	else if(y!='A' && z=='A')
    	{
    		res=res.charAt(0)+res.substring(2, x);
    	}
    	return res;
    }
}
