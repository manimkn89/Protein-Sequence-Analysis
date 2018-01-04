    import java.util.Collections;
    import java.util.Comparator;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Scanner;
    import java.util.Stack;
    import java.util.Vector;
    import java.io.*;
    public class Hybrid_matching
    {

		static int i,j,k,c=0,w;
		static char m;
		static Vector vv1=new Vector();
		static Vector vv2=new Vector();
		static Vector vv3=new Vector();
		static Vector vv4=new Vector();

        public static void main(String arg[])
        {
			try
			{

				BufferedReader brs=new BufferedReader(new FileReader("Main_pattern.txt"));
				//BufferedWriter bwk=new BufferedWriter(new FileWriter(".txt"));
				String ghg="",tempk="";
				int y=2;
				while((ghg=brs.readLine())!=null)
				{
					String mai[]=ghg.split("=");
					if(mai[0].equals("e"))
					{
						vv1.add(mai[1]);
					}
					if(mai[0].equals("c"))
					{
						vv2.add(mai[1]);
					}
					if(mai[0].equals("h"))
					{
						vv3.add(mai[1]);
					}
					if(mai[0].equals("t"))
					{
						vv4.add(mai[1]);
					}

		    	}

		    	calculation();

		    	per();






		     //bwk.close();
		}


		catch(Exception em)
		{
			em.printStackTrace();
		}
      }

      public static void calculation()
      {
		  try
		  {
			  BufferedReader brs=new BufferedReader(new FileReader("out1.txt"));
			  BufferedWriter bwk=new BufferedWriter(new FileWriter("before.txt"));
			  String ghg="",tempk="";
			  int y=2;
			  while((ghg=brs.readLine())!=null)
			  {

				  for(int i=0;i<vv1.size();i++)
				  {
					  String aa=""+vv1.get(i);
					  String mz="";
					  if(ghg.contains(aa))
					  {
						  int si=aa.length();
						  for(int cz=0;cz<si;cz++)
						  mz+="e";
						  ghg=ghg.replace(aa,mz);
					  }
				  }


				  for(int i=0;i<vv2.size();i++)
				  {
					  String aa=""+vv2.get(i);
					  String mz="";
					  if(ghg.contains(aa))
					  {
						  int si=aa.length();
						  for(int cz=0;cz<si;cz++)
						  mz+="c";
						  ghg=ghg.replace(aa,mz);
					  }
				  }
				  for(int i=0;i<vv3.size();i++)
				  {
					  String aa=""+vv3.get(i);
					  String mz="";
					  if(ghg.contains(aa))
					  {
						  int si=aa.length();
						  for(int cz=0;cz<si;cz++)
						  mz+="h";
						  ghg=ghg.replace(aa,mz);
					  }
				  }

				  for(int i=0;i<vv4.size();i++)
				  {
					  String aa=""+vv4.get(i);
					  String mz="";
					  if(ghg.contains(aa))
					  {
						  int si=aa.length();
						  for(int cz=0;cz<si;cz++)
						  mz+="t";
						  ghg=ghg.replace(aa,mz);
					  }
				  }
				  System.out.println(ghg);
				  for (int i = 0; i < ghg.length(); i++)
				  {

				     if(Character.isUpperCase(ghg.charAt(i)))
				     {
				     	ghg=ghg.replace(""+ghg.charAt(i),"x");
				     }

                  }
				  bwk.write(ghg+"\n");

			  }


			  bwk.close();




		  }
		  catch(Exception e)
		  {

		  }
	  }




	  public static void per()
	{
		  try
		  {
			  BufferedReader brs=new BufferedReader(new FileReader("before.txt"));
			  //BufferedWriter bwk=new BufferedWriter(new FileWriter("before.txt"));
			  String ghg="",tempk="";
			  int y=2;
			  while((ghg=brs.readLine())!=null)
		  	  {
				System.out.println(ghg);
			  }
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }

	}



    }
