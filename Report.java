package report;

public class Report {
    private final String title;
    private final String author;
    private final String date;
    private final String content;


    private Report(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.date = builder.date;
        this.content = builder.content;
    }

    @Override
    public String toString() {
        return String.format("Report:\nTitle: %s\nAuthor: %s\nDate: %s\nContent: %s\n",
                title, author, date, content);
    }


    public static class Builder {
        private String title;
        private String author;
        private String date;
        private String content;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }
}
