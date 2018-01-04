    import java.util.Collections;
    import java.util.Comparator;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Scanner;
    import java.util.Stack;
    import java.util.Vector;
    import java.io.*;
    public class Percentage
    {

		static int i,j,k,c=0,w;
		static char m;
		static double el=0,cl=0,hl=0,tl=0,xl=0;
		static Vector vv=new Vector();

        public static void main(String arg[])
        {
			try
			{

				BufferedReader brs=new BufferedReader(new FileReader("before.txt"));
				//BufferedWriter bwk=new BufferedWriter(new FileWriter(".txt"));
				String ghg="",tempk="";
				int y=2;
				while((ghg=brs.readLine())!=null)
				{
					String mai[]=ghg.split("");

					if(ghg.contains(">"))
					{
						//System.out.println(ghg);
					}
					else
					{
						tempk+=ghg;

					}
		    	}
		    	System.out.println(tempk);
		    	frequencycount(tempk);

		    	Collections.sort(vv);
		    	double co1=0;
		    	double co2=0;
		    	double co3=0;
		    	double co4=0;
		    	double co5=0;
		    	String fir[]={"e"};
		    	String sec[]={"c"};
		    	String thi[]={"h"};
		    	String fou[]={"t"};
		    	String fiv[]={"x"};
		    	for(int kk=0;kk<vv.size();kk++)
		    	{
					String in=""+vv.get(kk);
					for(int fi=0;fi<fir.length;fi++)
					{
						if(in.contains(fir[fi]))
						{
							String aa[]=in.split("=");
							int co=Integer.parseInt(aa[1]);
							co1+=co;

						}
					}
					for(int sc=0;sc<sec.length;sc++)
					{
						if(in.contains(sec[sc]))
						{
							String aa[]=in.split("=");
							int co=Integer.parseInt(aa[1]);
							co2+=co;
						}
					}
					for(int sc=0;sc<thi.length;sc++)
					{
						if(in.contains(thi[sc]))
						{
							String aa[]=in.split("=");
							int co=Integer.parseInt(aa[1]);
							co3+=co;
						}
					}
					for(int sc=0;sc<fou.length;sc++)
					{
						if(in.contains(fou[sc]))
						{
							String aa[]=in.split("=");
							int co=Integer.parseInt(aa[1]);
							co4+=co;
						}
					}
					for(int sc=0;sc<fiv.length;sc++)
					{
						if(in.contains(fiv[sc]))
						{
							String aa[]=in.split("=");
							int co=Integer.parseInt(aa[1]);
							co5+=co;
						}
					}

				}

				System.out.println("co1  :"+co1);
				System.out.println("co2  :"+co2);
				System.out.println("co3  :"+co3);
				System.out.println("co4  :"+co4);
				System.out.println("co5  :"+co5);
				double total=co1+co2+co3+co4+co5;

				el=(co1/total)*100;
				cl=(co2/total)*100;
				hl=(co3/total)*100;
				tl=(co4/total)*100;
				xl=(co5/total)*100;



				System.out.println("eee "+el);
				System.out.println("ccc "+cl);
				System.out.println("hhh "+hl);
				System.out.println("ttt "+tl);
				System.out.println("xxx "+xl);

				Main.ta.append("\ne Count in percentage "+el+" %");
				Main.ta.append("\nc Count in percentage "+cl+" %");
				Main.ta.append("\nh Count in percentage "+hl+" %");
				Main.ta.append("\nt Count in percentage "+tl+" %");
				Main.ta.append("\nx Count in percentage "+xl+" %\n\n");


				//Main.ta.append("\n\nInput Sequence is : Hydrophilic\n\n");

		     //bwk.close();
		}


		catch(Exception em)
		{
			em.printStackTrace();
		}
      }

      static void frequencycount(String s)

	      {

	          char[] z=new char[s.length()];
	          for(w=0;w<s.length();w++)
	          z[w]=s.charAt(w);
	          for(i=0;i<w;i++)
	          {
	              char ch=z[i];
	              for(j=i+1;j<w;j++)
	              {
	                  if(z[j]==ch)
	                  {
	                      for(k=j;k<(w-1);k++)
	                      z[k]=z[k+1];
	                      w--;
	                      j=i;
	                  }
	              }
	          }

	          int[] t=new int[w];
	          for(i=0;i<w;i++)
	          {
	              for(j=0,c=0;j<s.length();j++)
	              {
	                  if(z[i]==s.charAt(j))
	                  c++;
	              }
	              t[i]=c ;
	              //System.out.print(z[i]+"="+c+",");
	              vv.add(z[i]+"="+c);
	          }
    }


    }
