
Protein Sequence Analysis
-------------------------------------------
Date: 04.01.2018
-------------------------------------------

Author: P.Manikandan, Dr.D.Ramyachitra

Contact email: manimkn89@gmail.com , jaichitra1@yahoo.co.in



-------------------------------------------
Applications
-------------------------------------------

For Protein Sequence Analysis

1. Allow user to predict the amino acid patterns from the protein sequences.

2. Allow user to predict the physiochemical properties such as Hydrophobic Non-Polar ALKYL Amino Acid groups, Hydrophobic Non-Polar AROMATIC Amino Acid groups, Hydrophilic Polar Neutral Amino Acid groups, Hydrophilic Polar Acidic Amino Acid groups and Hydrophilic Polar Basic Amino Acid groups of a protein sequence.

3. Allow user to predict the secondary structure of protein where the structure of protein sequence is unknown.
4. Allow user to perform the similarity analysis of protein sequence (structure unknown) with the CATH database.



-------------------------------------------
Install
-------------------------------------------

1. Download the package

	git clone --recursive https://github.com/manimkn89/Protein-Sequence-Analysis/



--------------

2. Compile


  
















-------------------------------------------
Windows system and CPU type
-------------------------------------------

Protein Sequence Analysis Tool has been compiled and tested under the following Windows system,

	Windows 8 
	
	Java version 1.8 
	
    MySql 5.1.48

with the following CPU type,

	Intel(R) Core(TM) i5-2500 CPU @ 3.30GHz



-------------------------------------------
Setup for Protein Sequence Analysis
-------------------------------------------

Amino Acid Pattern
-------------------------------------------

1.	Run the file named as Main. Java inside the SeqAnalysis folder.
2.	Select the Load protein option in the output window.
3.	In this package please find an example Input Dataset in Input/Data.Txt.
	
	[Users can download some protein sequence from any sequence repositories like SCOP, CATH, 	UNIPROT…Then run the input sequence in online SOPM server and save the sequences in text 	document with fasta format and place it in the Input folder of the directory]
4.	Then select the predict pattern option in the output window for predicting the protein patterns for four secondary structural classes, namely Alpha Helix (h), Beta Sheet (e), Turn (t) and Coil (c).
5.	Load pattern option in the output window is used to store the secondary structural patterns into mysql database.

	[In this tool the username and password for connecting with mysql database is mentioned below

	Username: root

	Password: root
	
	If the user has to change the login details, please update the information’s in the MysqlConnect.Java file].



-------------------------------------------

Physiochemical Properties 
-------------------------------------------
6.	Input raw sequence option is used to predict the physiochemical properties for a protein sequence where the structure is unknown.

7.	Physiochemical properties includes the positive charged, negative charged, extinction coefficient, Hydrophobic Non-Polar ALKYL Amino Acid groups, Hydrophobic Non-Polar AROMATIC Amino Acid groups, Hydrophilic Polar Neutral Amino Acid groups, Hydrophilic Polar Acidic Amino Acid groups and Hydrophilic Polar Basic Amino Acid groups.

--------------------------------------------
Protein Secondary Structure 
--------------------------------------------
8.	Predict option is used to predict the secondary structure for a protein sequence where the structure is unknown. The secondary structures are predicted based on the patterns of secondary structural classes stored in the mysql database.

9.	Pattern result option is used to show the amount of patterns predicted for the secondary structural classes by using the Hybrid KMP & BM algorithm.

----------------------------------------------
Protein Similarity Analysis
----------------------------------------------
10.	Similarity option is used to perform the similarity analysis for the input raw sequence of the protein (structure Unknown) with the cath domain sequence (latest release updated on Jan 2018).

11.	Similarity value ranges from 0 to 1. In this tool the value is set to 0.6 to predict similar sequences from the cath database.


