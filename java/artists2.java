class artists2 {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import comicBooks.*;%>
//&&&staticSymbol&&&<%
 Artist artist = (Artist) argument; 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<h1><%
//&&&staticSymbol&&&=artist.getName()
//&&&staticSymbol&&&%></h1>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<h2>Books Artist For</h2>
//&&&staticSymbol&&&<ul>
//&&&staticSymbol&&&<%
 for (Book book : artist.getBooksArtistFor()) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	<li><a href="<%
//&&&staticSymbol&&&=book.getName()
//&&&staticSymbol&&&%>.html"><%
//&&&staticSymbol&&&=book.getName()
//&&&staticSymbol&&&%></a></li>
//&&&staticSymbol&&&<%
 } 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&</ul>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<h2>Books Cover Artist For</h2>
//&&&staticSymbol&&&<ul>
//&&&staticSymbol&&&<%
 for (Book coverBook : artist.getBooksCoverArtistFor()) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	<li><a href="<%
//&&&staticSymbol&&&=coverBook.getName()
//&&&staticSymbol&&&%>.html"><%
//&&&staticSymbol&&&=coverBook.getName()
//&&&staticSymbol&&&%></a></li>
//&&&staticSymbol&&&<%
 } 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&</ul>
//&&&staticSymbol&&&
//&&&staticSymbol&&&
//&&&staticSymbol&&&<a href="artists.html">Back</a>

}
}