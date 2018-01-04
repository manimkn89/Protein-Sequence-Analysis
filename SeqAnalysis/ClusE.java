    import java.util.Collections;
    import java.util.Comparator;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Scanner;
    import java.util.Stack;
    import java.util.Vector;
    import java.io.*;
    public class ClusE
    {

		static int i,j,k,c=0,w;
		static char m;
		static Vector vv=new Vector();

        public static void main(String arg[])
        {
			try
			{

				BufferedReader brs=new BufferedReader(new FileReader(arg[0]));
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
		    	int co1=0;int co8=0;int co9=0;int co10=0;int co11=0;int co12=0; int co13=0;int co14=0;int co15=0;int co16=0;
		    	int co2=0;int co3=0;int co4=0;int co5=0;int co6=0;int co7=0;
		    	String HNPolarALKYL[]={"G","A","V","L","I","M","P"};
		    	String HNPolarAROMATIC[]={"F","W"};
		    	String HPNeutral[]={"Y","S","T","C","Q","N"};
		    	String HPAcidic[]={"E","D"};
		    	String HPBasic[]={"K","H","R"};
		    	String HPBasicKR[]={"K","R"};
		    	String EXTY[]={"Y"};
				String EXTW[]={"W"};
		    	String EXTC[]={"C"};
		    	for(int kk=0;kk<vv.size();kk++)
		    	{
					String in=""+vv.get(kk);
					for(int sc=0;sc<HNPolarALKYL.length;sc++)
					{
						if(in.contains(HNPolarALKYL[sc]))
						{
							String aa[]=in.split("=");
							int co=Integer.parseInt(aa[1]);
							co8+=co;
						}
					}

					for(int sc=0;sc<HNPolarAROMATIC.length;sc++)
					{
						if(in.contains(HNPolarAROMATIC[sc]))
						{
							String aa[]=in.split("=");
							int co=Integer.parseInt(aa[1]);
							co9+=co;
						}
					}


					for(int sc=0;sc<HPNeutral.length;sc++)
					{
						if(in.contains(HPNeutral[sc]))
						{
							String aa[]=in.split("=");
							int co=Integer.parseInt(aa[1]);
							co10+=co;
						}
					}


					for(int sc=0;sc<HPAcidic.length;sc++)
					{
						if(in.contains(HPAcidic[sc]))
						{
							String aa[]=in.split("=");
							int co=Integer.parseInt(aa[1]);
							co11+=co;
						}
					}


					for(int sc=0;sc<HPBasic.length;sc++)
					{
						if(in.contains(HPBasic[sc]))
						{
							String aa[]=in.split("=");
							int co=Integer.parseInt(aa[1]);
							co12+=co;
						}
					}
// KR -- Starts
					for(int kr=0;kr<HPBasicKR.length;kr++)
						{
							if(in.contains(HPBasicKR[kr]))
							{
								String aa[]=in.split("=");
								int co=Integer.parseInt(aa[1]);
								co13+=co;
							}
					}
					// KR -- Ends

					//EXT Starts
					for(int e1=0;e1<EXTY.length;e1++)
					{
						if(in.contains(EXTY[e1]))
							{
								String aa[]=in.split("=");
								int co=Integer.parseInt(aa[1]);
								co14+=co;
							}
						}

					for(int e2=0;e2<EXTW.length;e2++)
						{
							if(in.contains(EXTW[e2]))
							{
								String aa[]=in.split("=");
								int co=Integer.parseInt(aa[1]);
								co15+=co;
							}
						}

					for(int e3=0;e3<EXTC.length;e3++)
						{
							if(in.contains(EXTC[e3]))
							{
								String aa[]=in.split("=");
								int co=Integer.parseInt(aa[1]);
								co16+=co;
							}
						}

				}
				int pm=co14*1490+co15*5500+co16*125;
				//String nam[]={"Non-polar","Polar","Hydrophobic","Hydrophilic","Positive Charge","Negative Charge","Neutral Charge","Hydrophobic Non-Polar ALKYL Amino Acid groups","Hydrophobic Non-Polar AROMATIC Amino Acid groups","Hydrophilic Polar Neutral Amino Acid group","Hydrophilic Polar Acidic Amino Acid group","Hydrophilic Polar Basic  Amino Acid group"};
				String nam[]={"Hydrophobic Non-Polar ALKYL Amino Acid groups","Hydrophobic Non-Polar AROMATIC Amino Acid groups","Hydrophilic Polar Neutral Amino Acid group","Hydrophilic Polar Acidic Amino Acid group","Hydrophilic Polar Basic  Amino Acid group"};
				int arr[]={co8,co9,co10,co11,co12};


				System.out.println("co8  :"+co8);
				System.out.println("co9  :"+co9);
				System.out.println("co10  :"+co10);
				System.out.println("co11  :"+co11);
				System.out.println("co12  :"+co12);
				System.out.println("co12  :"+co13);
				System.out.println("co12  :"+co14);
				System.out.println("co12  :"+co15);
				System.out.println("co12  :"+co16);

				int maxIndex = 0;
				    for (int i = 1; i < arr.length; i++) {
				        int newnumber = arr[i];
				        if ((newnumber > arr[maxIndex])) {
				            maxIndex = i;
				        }
				    }
   				System.out.println("max   :    "+maxIndex);
				Main.ta.append("\n\nInput Sequence is : "+nam[maxIndex]+"\n\n"+"Total number of negatively charged residues (Asp + Glu): "+co11+"\n\n"+"Total number of positively charged residues (Arg + Lys):"+co13+ "\n\n"+"Ext. coefficient:"+pm+"\n");
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
