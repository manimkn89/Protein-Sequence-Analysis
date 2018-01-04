    import java.util.Collections;
    import java.util.Comparator;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Scanner;
    import java.util.Stack;
    import java.util.Vector;
    import java.io.*;
    public class Similarity
    {

		static int i,j,k,c=0,w;
		static char m;
		static Vector vv=new Vector();
		static BufferedWriter bwk;

        public static void main(String arg[])
        {
			try
			{
				bwk=new BufferedWriter(new FileWriter("insim.txt"));
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
							bwk.write(ghg+"=");
						}
						else
						{
							bwk.write("\n"+ghg+"=");
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
							bwk.write(""+ghg);
							System.out.println(ghg);

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

		     bwk.close();


		}


		catch(Exception em)
		{
			em.printStackTrace();
		}
      }
  }
