import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class BookStorePage extends BasePage {

    public BookStorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#login")
    private WebElement loginButton;

    @FindBy(css = "#userName-value")
    private WebElement userNameValue;

    @FindBy(xpath = "(//div[@class='action-buttons'])")
    private List<WebElement> booksTitles;

    @FindBy(xpath = "(//div[@class='rt-td'])")
    private List<WebElement> booksRows;

    @FindBy(css = "span[id='see-book-Git Pocket Guide']")
    private WebElement gitPocketGuideBook;

    @FindBy(css = "span[id='see-book-Eloquent JavaScript, Second Edition']")
    private WebElement eloquentJavaScripBook;

    @FindBy(css = "span[id='see-book-Speaking JavaScript']")
    private WebElement speakingJavaScriptBook;

    @FindBy(css = ".rt-tr-group")
    List<WebElement> booklist;

    @FindBy(css = "input[placeholder='Type to search']")
    private WebElement typeToSearchBox;

    @FindBy(css = "#app > div > div > div.pattern-backgound.playgound-header")
    private WebElement subTitle;

    @FindBy(xpath = "(//div[@class='rt-resizable-header-content'])[1]")
    private WebElement imageWord;

    @FindBy(xpath = "(//div[@class='rt-resizable-header-content'])[2]")
    private WebElement titleWord;

    @FindBy(xpath = "(//div[@class='rt-resizable-header-content'])[3]")
    private WebElement authorWord;

    @FindBy(xpath = "(//div[@class='rt-resizable-header-content'])[4]")
    private WebElement publisherWord;

    @FindBy(css = ".header-text")
    private List<WebElement> menuButtons;

    public void clickLoginButton() {
        clickElement(this.loginButton);
    }

    public String getNameText() {
        return getText(this.userNameValue);
    }

    public void printBooksTitles() {
        for (WebElement element : booksTitles) {
            System.out.println(getText(element));
        }
    }

    public void printBooksAuthors() {
        for (int i = 2; i <= booksRows.size(); i += 4) {
            if (!booksRows.get(i).getText().isBlank()) {
                System.out.println(booksRows.get(i).getText());
            }
        }
    }

    public void printBooksPublisher() {
        for (int i = 3; i <= booksRows.size(); i += 4) {
            if (!booksRows.get(i).getText().isBlank()) {
                System.out.println(booksRows.get(i).getText());
            }
        }
    }

    public boolean isDisplayedSixMenuButtons() {
        if(menuButtons.size() == 6) {
            return true;
        }else {
            return false;
        }
    }

    public void clickGitPocketGuideBookField() {
        clickElement(this.gitPocketGuideBook);
    }

    public boolean isDisplayedImageWord() {
        return isDisplayed(this.imageWord);
    }

    public boolean isDisplayedPublisherWord() {
        return isDisplayed(this.publisherWord);
    }

    public boolean isDisplayedAuthorWord() {
        return isDisplayed(this.authorWord);
    }

    public boolean isDisplayedTitleWord() {
        return isDisplayed(this.titleWord);
    }

    public void clickEloquentJavaScripBookField() {
        clickElement(this.eloquentJavaScripBook);
    }

    public void scrollToEloquentJavaScripBook() {
        scrollToElement(this.eloquentJavaScripBook);
    }

    public void scrollToSpeakingJavaScriptBook() {
        scrollToElement(this.speakingJavaScriptBook);
    }

    public void clickSpeakingJavaScriptBook() {
        clickElement(this.speakingJavaScriptBook);
    }

    public boolean isDisplayedTypeToSearch() {
        return isDisplayed(this.typeToSearchBox);
    }

    public boolean isDisplayedLoginButton() {
        return isDisplayed(this.loginButton);
    }

    public boolean isSubTitlePresent() {
        return isDisplayed(this.subTitle)
                && subTitle.getText().equalsIgnoreCase("Book Store");
    }

    public boolean verifyBookIsPresent(String bookTitle) {
        for (WebElement element : booklist) {
            if (element.getText().equalsIgnoreCase(bookTitle)) {
                return true;
            }
        }
        return false;
    }

    public void printAuthorAndPublisherIfBookIsPresent(String bookTitle) {
        boolean bookFound = false;
        for (WebElement element : booklist) {
            if (element.getText().contains(bookTitle) && element.getText().contains(bookTitle)) {
                String[] arr = element.getText().split("\n");
                System.out.println("Author: " + arr[1] + " publisher: " + arr[2]);
                bookFound = true;
                break;
            }
        }
        if (!bookFound)
            System.out.println("Error, book not found.");
    }

    public void printBookTitleByIndex(int bookNumber) {
        if (bookNumber > 0 && !booksTitles.get(bookNumber).getText().isBlank()) {
            System.out.println(booksTitles.get(bookNumber - 1).getText());
        }
    }

    public void printBookAuthorByIndex(int bookNumber) {
        if (bookNumber > 0 && bookNumber < booklist.size()) {
            if (!booklist.get(bookNumber - 1).getText().isBlank()) {
                String[] arr = booklist.get(bookNumber - 1).getText().split("\n");
                System.out.println(arr[1]);
            } else {
                System.out.println("Error, invalid book number");
            }
        } else {
            System.out.println("Error, invalid book number");
        }
    }

    public void findAuthorByTitle(String key) {
            int counter1 = 0;
            int counter2 = 1;
            ArrayList<String> list = new ArrayList<>();
            Map<String, String> hashMap = new HashMap<>();
            for (WebElement e : booksRows) {
                if (!e.getText().isBlank()) {
                    list.add(e.getText());
                }
            }
            for (int i = 2; i <= list.size(); i += 2) {
                list.remove(i);
                hashMap.put(list.get(counter1), list.get(counter2));
                counter1 += 2;
                counter2 += 2;
            }
            System.out.println(hashMap.get(key));
    }

    public void findTitleByAuthor(String value) {
            int counter1 = 0;
            int counter2 = 1;
            ArrayList<String> list = new ArrayList<>();
            Map<String, String> hashMap = new HashMap<>();
            for (WebElement e : booksRows) {
                if (!e.getText().isBlank()) {
                    list.add(e.getText());
                }
            }
            for (int i = 2; i <= list.size(); i += 2) {
                list.remove(i);
                hashMap.put(list.get(counter2), list.get(counter1));
                counter1 += 2;
                counter2 += 2;
            }
            System.out.println(hashMap.get(value));
    }
}
