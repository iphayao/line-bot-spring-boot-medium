package com.iphayao.linebot.flex;

import com.linecorp.bot.model.action.URIAction;
import com.linecorp.bot.model.message.FlexMessage;
import com.linecorp.bot.model.message.flex.component.*;
import com.linecorp.bot.model.message.flex.component.Button.ButtonHeight;
import com.linecorp.bot.model.message.flex.component.Image.ImageAspectMode;
import com.linecorp.bot.model.message.flex.component.Image.ImageAspectRatio;
import com.linecorp.bot.model.message.flex.container.Bubble;
import com.linecorp.bot.model.message.flex.unit.FlexFontSize;
import com.linecorp.bot.model.message.flex.unit.FlexLayout;
import com.linecorp.bot.model.message.flex.unit.FlexMarginSize;

import java.util.function.Supplier;

import static java.util.Arrays.asList;
import static java.util.Arrays.fill;

public class BubbleFlexMessageSupplier implements Supplier<FlexMessage> {
    /**
     * Gets a result.
     *
     * @return a result
     */
    @Override
    public FlexMessage get() {
        final Image heroBlock = Image.builder()
                .url("https://2553d2b9.ngrok.io/cafe.jpg")
                .size(Image.ImageSize.FULL_WIDTH)
                .aspectRatio(ImageAspectRatio.R20TO13)
                .aspectMode(ImageAspectMode.Cover)
                .action(new URIAction("label", "http://example.com"))
                .build();
        final Box bodyBlock = createBodyBlock();
        final Box footerBlock = createFooterBlock();
        final Bubble bubble = Bubble.builder()
                .hero(heroBlock)
                .body(bodyBlock)
                .footer(footerBlock)
                .build();
        return new FlexMessage("ALT", bubble);
    }

    private Box createFooterBlock() {
        final Spacer spacer = Spacer.builder().size(FlexMarginSize.SM).build();
        final Button callAction = Button.builder()
                .style(Button.ButtonStyle.LINK)
                .height(ButtonHeight.MEDIUM)
                .action(new URIAction("CALL", "tel:00000"))
                .build();
        final Separator separator = Separator.builder().build();
        final Button websiteAction = Button.builder()
                .style(Button.ButtonStyle.LINK)
                .height(ButtonHeight.SMALL)
                .action(new URIAction("WEBSITE", "https://example.com"))
                .build();

        return Box.builder()
                .layout(FlexLayout.VERTICAL)
                .spacing(FlexMarginSize.SM)
                .contents(asList(spacer, callAction, separator, websiteAction))
                .build();

    }

    private Box createBodyBlock() {
        final Text title = Text.builder()
                .text("Phayao Cafe")
                .weight(Text.TextWeight.BOLD)
                .size(FlexFontSize.XL)
                .build();
        final Box review = createReviewBox();
        final Box info = createInfoBox();

        return Box.builder()
                .layout(FlexLayout.VERTICAL)
                .contents(asList(title, review, info))
                .build();
    }

    private Box createInfoBox() {
        final Box place = Box.builder()
                .layout(FlexLayout.BASELINE)
                .spacing(FlexMarginSize.SM)
                .contents(asList(
                        Text.builder()
                            .text("Place")
                            .color("#aaaaaa")
                            .size(FlexFontSize.SM)
                            .flex(1)
                            .build(),
                        Text.builder()
                            .text("Silom, Bangkok")
                            .wrap(true)
                            .color("#666666")
                            .flex(5)
                            .build()
                )).build();
        final Box time = Box.builder()
                .layout(FlexLayout.BASELINE)
                .spacing(FlexMarginSize.SM)
                .contents(asList(
                        Text.builder().text("Time")
                            .color("#aaaaaa")
                            .size(FlexFontSize.SM)
                            .flex(1)
                            .build(),
                        Text.builder()
                            .text("10:00 - 23:00")
                            .wrap(true)
                            .color("#666666")
                            .size(FlexFontSize.SM)
                            .flex(5)
                            .build()
                )).build();
        return Box.builder()
                .layout(FlexLayout.VERTICAL)
                .margin(FlexMarginSize.LG)
                .spacing(FlexMarginSize.SM)
                .contents(asList(place, time))
                .build();
    }

    private Box createReviewBox() {
        final Icon goldStar = Icon.builder()
                .size(FlexFontSize.SM)
                .url("https://2553d2b9.ngrok.io/gold_star.png")
                .build();
        final Icon grayStar = Icon.builder()
                .size(FlexFontSize.SM)
                .url("https://2553d2b9.ngrok.io/gray_star.png")
                .build();
        final Text point = Text.builder()
                .text("4.0")
                .size(FlexFontSize.SM)
                .color("#999999")
                .margin(FlexMarginSize.MD)
                .flex(0)
                .build();

        return Box.builder()
                .layout(FlexLayout.BASELINE)
                .margin(FlexMarginSize.MD)
                .contents(asList(goldStar, goldStar, goldStar, goldStar, grayStar, point))
                .build();
    }

}
