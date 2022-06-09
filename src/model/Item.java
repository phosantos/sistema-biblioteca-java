package model;

public class Item {

  private int id, publicationYear;
  private String title, author, publisher, kind, description;
  private boolean isAvailable;

  public Item(int id, int publicationYear, String title, String author, String publisher, String kind,
      String description, boolean isAvailable) {
    this.id = id;
    this.publicationYear = publicationYear;
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.kind = kind;
    this.description = description;
    this.isAvailable = isAvailable;
  }

  public Item(int id, int publicationYear, String title, String author, String publisher, String kind,
      String description) {
    this.id = id;
    this.publicationYear = publicationYear;
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.kind = kind;
    this.description = description;
    this.isAvailable = true;
  }

  public Item(int publicationYear, String title, String author, String publisher, String kind,
      String description) {
    this.publicationYear = publicationYear;
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.kind = kind;
    this.description = description;
    this.isAvailable = true;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getPublicationYear() {
    return publicationYear;
  }

  public void setPublicationYear(int publicationYear) {
    this.publicationYear = publicationYear;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

}
