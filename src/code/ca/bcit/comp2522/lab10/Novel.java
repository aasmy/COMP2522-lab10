package ca.bcit.comp2522.lab10;

/**
 * Represents a novel with a title, an author name, and a publication year.
 *
 * @author Abdullah Alasmy
 * @author Indy Grewal
 * @version 1.0
 */
public final class Novel
{

    private static final int MIN_YEAR = 1400;
    private static final int MAX_YEAR = 2100;


    private final String title;
    private final String authorName;
    private final int yearPublished;


    /**
     * Constructs a Novel with validated fields.
     *
     * @param title         the title of the novel
     * @param authorName    the author's name
     * @param yearPublished the publication year
     *
     * @throws IllegalArgumentException if any argument is invalid
     */
    public Novel(final String title,
                 final String authorName,
                 final int yearPublished)
    {
        validateTitle(title);
        validateAuthorName(authorName);
        validateYear(yearPublished);

        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * Validates the novel title.
     *
     * @param inputTitle the title to validate
     * @throws IllegalArgumentException if the input title is null or blank
     */
    private void validateTitle(final String inputTitle)
    {
        if (inputTitle == null || inputTitle.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be null or blank.");
        }
    }

    /**
     * Validates the author's name.
     *
     * @param inputAuthor the author name to validate
     * @throws IllegalArgumentException if the author name is null or blank
     */
    private void validateAuthorName(final String inputAuthor)
    {
        if (inputAuthor == null || inputAuthor.isBlank())
        {
            throw new IllegalArgumentException("Author name cannot be null or blank.");
        }
    }

    /**
     * Validates the publication year.
     *
     * @param inputYear the year to validate
     * @throws IllegalArgumentException if the year is outside the allowed range
     */
    private void validateYear(final int inputYear)
    {
        if (inputYear < MIN_YEAR || inputYear > MAX_YEAR)
        {
            throw new IllegalArgumentException("Year must be between " + MIN_YEAR + " and " + MAX_YEAR + ".");
        }
    }

    /**
     * Returns the novel title.
     *
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the author's name.
     *
     * @return the author's name
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Returns the publication year.
     *
     * @return the publication year
     */
    public int getYearPublished()
    {
        return yearPublished;
    }


    /**
     * Returns a string representation of this novel.
     *
     * @return formatted novel details
     */
    @Override
    public String toString()
    {
        return "Title: " + title +
                "\nAuthor: " + authorName +
                "\nYear Published: " + yearPublished;
    }
}