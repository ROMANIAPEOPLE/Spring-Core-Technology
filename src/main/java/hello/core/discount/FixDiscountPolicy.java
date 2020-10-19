package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }
        else {
            return 0;

        }

    }
}
