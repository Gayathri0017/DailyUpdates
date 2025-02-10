package com.oops;
interface Search{
	public abstract void searchbyTitle(String title);
	public abstract void searchbyLanguage(String language);
	public abstract void searchbyGenre(String genre);
	public abstract void searchbyReldate(Date rel);
	public abstract void searchbycity(String city);
}
class catalog implements Search{
	private static Date lastUpdated;
	private static List<Movie> ml=new ArrayList<Movie>();
	public void addMovie(Movie m) {
		ml.add(m);
		Calander cal=Calander.getInstance();
		DateFormat dateformat=new SimpleDateFormat("dd/mm/yyyy");
		Data date=cal.getTime();
		String todaysDate=dataFormat.format(date);
		System.out.println("Todays date:"+todaysDate);
		lastUpdated=date;
	}
	public void listMovie() {
		for(Movie movie:ml) {
			movie.getMovieDetail();
		}
	}
	
}
public class Interface1 {

}
