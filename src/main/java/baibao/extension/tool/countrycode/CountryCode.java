package baibao.extension.tool.countrycode;

import java.io.Serializable;

/**
 * 国家/地区编码（ISO 3166-1）.
 * @author Kahle
 */
public class CountryCode implements Serializable {
    private String nameEn;
    private String nameZh;
    private String fullNameEn;
    private String fullNameZh;
    private String alphaCode2;
    private String alphaCode3;
    private String numericCode3;

    public String getNameEn() {

        return nameEn;
    }

    public void setNameEn(String nameEn) {

        this.nameEn = nameEn;
    }

    public String getNameZh() {

        return nameZh;
    }

    public void setNameZh(String nameZh) {

        this.nameZh = nameZh;
    }

    public String getFullNameEn() {

        return fullNameEn;
    }

    public void setFullNameEn(String fullNameEn) {

        this.fullNameEn = fullNameEn;
    }

    public String getFullNameZh() {

        return fullNameZh;
    }

    public void setFullNameZh(String fullNameZh) {

        this.fullNameZh = fullNameZh;
    }

    public String getAlphaCode2() {

        return alphaCode2;
    }

    public void setAlphaCode2(String alphaCode2) {

        this.alphaCode2 = alphaCode2;
    }

    public String getAlphaCode3() {

        return alphaCode3;
    }

    public void setAlphaCode3(String alphaCode3) {

        this.alphaCode3 = alphaCode3;
    }

    public String getNumericCode3() {

        return numericCode3;
    }

    public void setNumericCode3(String numericCode3) {

        this.numericCode3 = numericCode3;
    }
}
