package com.adpc.biblioteca;

public class Loan {
    public String book;
    public String user;
    public Integer loandate;
    public Integer returndate;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user){
        this.user = user;
    }

    public Integer getLoandate() {
        return loandate;
    }

    public void setLoandate(Integer loandate) {
        this.loandate = loandate;
    }

    public Integer getReturndate() {
        return returndate;
    }

    public void setReturndate(Integer returndate) {
        this.returndate = returndate;
    }
}
