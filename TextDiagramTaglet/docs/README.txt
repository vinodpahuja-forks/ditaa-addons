USAGE
-----
The textdiagram taglet only works with the StandardDoclet. It only works with
JDK 1.5 (and above?). 

Enable the taglet by adding the following arguments to javadoc:
> javadoc -taglet se.ngm.javadoc.TextDiagramTaglet -tagletpath TextDiagramTaglet.jar ...

The syntax of the textdiagram tag is:
{@textdiagram uniqueName
 The diagram should be here...
}

I don't need to say that the tag should be put in a javadoc comment, do I? ;-)

For information on the syntax of the text diagram, see
http://ditaa.sourceforge.org
