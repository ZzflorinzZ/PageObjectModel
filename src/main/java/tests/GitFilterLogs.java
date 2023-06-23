package tests;

public class GitFilterLogs {
	
	/**
	 * Filtering the git log
	 * 
	 * git log ==> afiseaza logul complet
	 * git log --oneline ==> full log truncated		/ --oneline = flag optional
	 * git log --oneline --all ==> arata commit-urile de pe toate branch-urile (full log truncated on all branches)
	 * 
	 * 
	 * git log --oneline --all --graph ==> show history with graph
	 * 
	 * git log --oneline -4 ==> filtering by number of commits
	 * 
	 * git log --oneline --after="2023-06-01" ==> filter by date
	 * git log --oneline --before="2023-06-01"
	 * 
	 * git log --oneline --author ==> filter by author
	 * 
	 * git log --oneline --author --stat ==> arata fisierele modificate
	 * 
	 * git log --oneline --patch ==> arata liinile de cod modificate
	 * 
	 * git log --oneline --grep="commit message" ==> filter by commit message
	 * 
	 * 
	 * clear ==> sterge mesajele afisate
	 * 
	 */

}
