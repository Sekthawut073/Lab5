package com.example.lab3;

public class TextNote extends Note {
    //Att
    private String textContent;

    //getter
    public String getTextContent (){
        return textContent;
    }

    //setter
    public void setTextContent(String newContent){
        this.textContent = newContent;
    }

    //
    public String getSummary(){
        return title=":"+textContent+"("+createdDate+")";
        //System.out.println (title=":"+textContent+"("+createdDate+")");
    }
}

//Method
    //public String getSummary(){
    //    return title+":"+textContent+"("+createdDate+")";
        //System.out.println(title+":"+content+"("+createdDate")");
    //}







