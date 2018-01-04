    import java.util.Collections;
    import java.util.Comparator;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Scanner;
    import java.util.Stack;
    import java.util.Vector;
    import java.io.*;
    public class Predict
    {

		static int i,j,k,c=0,w;
		static char m;
		static Vector vv=new Vector();
		static BufferedWriter bwk;

        public static void main(String arg[])
        {
			try
			{
				bwk=new BufferedWriter(new FileWriter("pattern.txt"));
				BufferedReader brs=new BufferedReader(new FileReader("out.txt"));
				String ghg="",tempk="",tempk1="",last="";
				String inpu1="",inpu2="";
				int y=2;
				int cc=0;
				while((ghg=brs.readLine())!=null)
				{
					String mai[]=ghg.split("");

					if(ghg.contains(">"))
					{
						if(cc==0)
						{
						}
						else
						{
							tempk1="";
						}
						cc++;
						//System.out.println(ghg);
					}
					else
					{
						if(y%2==0)
						{
							tempk+=ghg;
							inpu1+=ghg;
						}
						else
						{
							tempk1+=ghg;
							last=ghg;
							inpu2+=ghg;
						}
						y++;

					}

		    	}


		     //System.out.println(inpu1);
		     //System.out.println(inpu2);
		     use(inpu2,inpu1);
		     bwk.close();


		}


		catch(Exception em)
		{
			em.printStackTrace();
		}
      }
      public static void use(String ss,String ss1) {
		  try
		  {
		  Vector vche=new Vector();
	      String str=ss;
	      String str1=ss1;
	      String ans="";
	      String res="";
	      String[] splitString=str.split("");
	      String[] splitString1=str1.split("");
	      int count=1;
	      String finalString="";
	      for(int i=1;i<str.length()-1;i++)
	          {

	              if(splitString[i].equals(splitString[i+1]))
	              {
					  res+=splitString1[i]+"";
	                  ++count;

	              }
	              else
	              {

	                  finalString+=splitString[i]+count+",";
	                  ans=splitString[i]+count;
	                  if(count>=6)
	                  {
	              	  		System.out.println(ans+"\t"+res);
	              	  		if(vche.contains(res)){}
	              	  		else
	              	  		bwk.write(splitString[i]+"="+res+"\n");
	              	  		vche.add(res);
				  	  }
				  	  res="";
	                  count=1;
	              }

	          }
		  }
		  catch(Exception e)
		  {
		  }

    }



  }
