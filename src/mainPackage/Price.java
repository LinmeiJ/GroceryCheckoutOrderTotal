package mainPackage;

import specialPricePacakage.BuyNGetMAtAPercentageSellPrice;
import specialPricePacakage.MarkdownSellPrice;
import specialPricePacakage.NForXDollarSellPrice;
import specialPricePacakage.RegularSellPrice;

import java.math.BigDecimal;
import java.util.Map;

public class Price {
    private BigDecimal regularPrice;
    private MarkdownSellPrice markdownSellPrice;
    private NForXDollarSellPrice nForXDollarSellPrice;
    private BuyNGetMAtAPercentageSellPrice buyNGetMAtAPercentageSellPrice;
    private BigDecimal itemTotalPrice;

    public Price() {
    }

    public Price(BigDecimal regularPrice) {
        this.regularPrice = regularPrice;
    }

    public BigDecimal getRegularPrice() {
        return regularPrice;
    }

    public MarkdownSellPrice getMarkdownSellPrice() {
        return markdownSellPrice;
    }

    public NForXDollarSellPrice getnForXDollarSellPrice() {
        return nForXDollarSellPrice;
    }

    public BuyNGetMAtAPercentageSellPrice getBuyNGetMAtAPercentageSellPrice() {
        return buyNGetMAtAPercentageSellPrice;
    }

    public BigDecimal getItemTotalPrice(Item item, String name, int quantity) {

        return BigDecimal.valueOf(quantity).multiply(item.getPrice().getRegularPrice());
    }
}
