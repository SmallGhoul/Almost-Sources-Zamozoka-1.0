package net.optifine.features.module.hud;

import net.optifine.Global;
import net.optifine.config.*;
import net.optifine.managers.event.events.Render2DListener;
import net.optifine.util.font.TTFFontRenderer;
import net.optifine.util.render.RenderUtils;
import net.optifine.util.theme.ThemeManager;
import net.optifine.util.theme.ThemeManager.ThemeHelper;
import net.minecraft.class_4587;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Watermark extends Module implements Render2DListener {
   // $FF: synthetic field
   NumberSetting Jacob = new NumberSetting("Text Y-Offset", 0.0D, -5.0D, 5.0D, 0.004999999888241291D);
   // $FF: synthetic field
   public static final LinePos[] Jack = LinePos.values();
   // $FF: synthetic field
   BooleanSetting Thomas = new BooleanSetting("Draw Outline", false);
   // $FF: synthetic field
   BooleanSetting Mary;
   // $FF: synthetic field
   BooleanSetting William;
   // $FF: synthetic field
   DoubleSliderSetting Charlie = new DoubleSliderSetting("Position", 0.005D, 0.01D);
   // $FF: synthetic field
   public static final Mode[] Harry = Mode.values();
   // $FF: synthetic field
   EnumSetting< LinePos> George;
   // $FF: synthetic field
   BooleanSetting James;
   // $FF: synthetic field
   EnumSetting< Mode> Oscar;

   protected void Charlie() {
      EVENT_MANAGER.Jack(Render2DListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }

   static {
      "".length();
      if (null == null) {
         ;
      }
   }

   public void onRender2D(class_4587 matrixStack, float partialTicks) {
      String text;
      class_640 targetInfo;
      boolean hasPing;
      String ping;
      double width;
      double y2;
      double actualWidth;
      double actualHeight;
      class_634 var10000;
      double x;
      UUID var10001;
      double y;
      TTFFontRenderer font;
      double x;
      boolean var29;
      StringBuilder var30;
      String var31;
      String var32;
      switch(( Mode)this.Oscar.Harry()) {
      case Oliver:
         if (Global.Jack().q.isEnabled()) {
            var32 = "§fxXx_§rZ§f4m0r05k4_xXx";
            "".length();
            if (-(94 ^ 71 ^ 0 ^ 29) > 0) {
               return;
            }
         } else {
            var32 = "Z§famorozka";
         }

         text = var32;
         font = Global.Harry.getLogoFont();
         x = (double)((float)mc.method_22683().method_4486() - font.getWidth(text)) * this.Charlie.Oscar();
         width = (double)((float)mc.method_22683().method_4502() - font.getHeight(text)) * this.Charlie.James();
         font.drawStringWithShadow(text, x, width, ThemeManager.getPrimaryColor().getRGB());
         "".length();
         if (-" ".length() > 0) {
            return;
         }
         break;
      case Jack:
         if (Global.Jack().q.isEnabled()) {
            var32 = "§fxXx_§rZ§f4m0r05k4_xXx";
            "".length();
            if (-" ".length() >= 0) {
               return;
            }
         } else {
            var32 = "§lZ§famorozka";
         }

         text = var32;
         font = Global.Harry.getGeneric();
         x = (double)((float)mc.method_22683().method_4486() - font.getWidth(text)) * this.Charlie.Oscar();
         width = (double)((float)mc.method_22683().method_4502() - font.getHeight(text)) * this.Charlie.James();
         Global.Harry.getGeneric().drawStringWithShadow(text, x, width, ThemeManager.getPrimaryColor().getRGB());
         "".length();
         if ("   ".length() < 0) {
            return;
         }
         break;
      case Charlie:
         var10000 = Global.Oliver.method_1562();
         if (mc.field_1724 != null) {
            var10001 = mc.field_1724.method_5667();
            "".length();
            if ("  ".length() < -" ".length()) {
               return;
            }
         } else {
            var10001 = null;
         }

         targetInfo = var10000.method_2871(var10001);
         String ping = "";
         if (targetInfo != null) {
            ping = String.valueOf((new StringBuilder()).append(targetInfo.method_2959()).append("ms"));
         }

         var30 = new StringBuilder();
         if (Global.Jack().q.isEnabled()) {
            var31 = "xxx_z4m0r05k4_xxx";
            "".length();
            if (" ".length() == "   ".length()) {
               return;
            }
         } else {
            var31 = "zamorozka";
         }

         var30 = var30.append(var31).append(" | ");
         if (mc.field_1724 != null) {
            var31 = mc.field_1724.method_7334().getName();
            "".length();
            if ((5 ^ 85 ^ 117 ^ 33) <= 0) {
               return;
            }
         } else {
            var31 = "null";
         }

         text = String.valueOf(var30.append(var31).append(" | ").append(ping));
         if (Global.Jack().U.isEnabled()) {
            text = text.replaceAll(Global.Oliver.method_1548().method_1676(), Global.Jack().U.George());
         }

         double width = (double)Global.Harry.getSmallMain().getWidth(text);
         double height = (double)Global.Harry.getSmallMain().getHeight(text);
         double var34;
         if (this.George.Harry() == LinePos.Oliver) {
            var34 = 2.0D;
            "".length();
            if (-" ".length() >= (88 ^ 96 ^ 131 ^ 191)) {
               return;
            }
         } else {
            var34 = 6.0D;
         }

         y2 = var34;
         if (this.Thomas.Jack()) {
            var34 = width + 9.0D;
            "".length();
            if (-(25 ^ 29) > 0) {
               return;
            }
         } else {
            var34 = width + 6.0D;
         }

         actualWidth = var34;
         if (this.Thomas.Jack()) {
            var34 = height + y2 + 3.0D;
            "".length();
            if ("  ".length() == "".length()) {
               return;
            }
         } else {
            var34 = height + y2;
         }

         actualHeight = var34;
         var34 = ((double)mc.method_22683().method_4486() - actualWidth) * this.Charlie.Oscar();
         double var35;
         if (this.Thomas.Jack()) {
            var35 = 1.5D;
            "".length();
            if ((180 ^ 184 ^ 0 ^ 9) <= 0) {
               return;
            }
         } else {
            var35 = 0.0D;
         }

         x = var34 + var35;
         var34 = ((double)mc.method_22683().method_4502() - actualHeight) * this.Charlie.James();
         if (this.Thomas.Jack()) {
            var35 = 1.5D;
            "".length();
            if (-" ".length() > -" ".length()) {
               return;
            }
         } else {
            var35 = 0.0D;
         }

         y = var34 + var35;
         if (this.Thomas.Jack()) {
            RenderUtils.drawRect(x - 1.5D, y - 1.5D, x + width + 7.5D, y + height + y2 + 1.5D, ThemeHelper.getColor());
            RenderUtils.drawRect(x - 0.5D, y - 0.5D, x + width + 6.5D, y + height + y2 + 0.5D, ThemeHelper.getHeaderTextColor());
         }

         RenderUtils.drawRect(x, y, x + width + 6.0D, y + height + y2, ThemeHelper.getColor());
         if (this.George.Harry() == LinePos.Harry) {
            RenderUtils.drawGradientRect(x + 2.0D, y + height + 3.0D, x + width + 3.0D, y + height + 4.0D, ThemeManager.getPrimaryColor(x * 12.0D), ThemeManager.getPrimaryColor((x + width + 4.0D) * 12.0D), ThemeManager.getPrimaryColor((x + width + 4.0D) * 12.0D), ThemeManager.getPrimaryColor(x * 12.0D));
            Global.Harry.getSmallMain().drawString(text, x + 3.0D, y + y2 - 5.0D + (double)this.Jacob.George(), ThemeHelper.getHeaderTextColor().getRGB());
            "".length();
            "".length();
            if (" ".length() >= "  ".length()) {
               return;
            }
         } else if (this.George.Harry() == LinePos.Jack) {
            RenderUtils.drawGradientRect(x + 2.0D, y + 2.0D, x + width + 3.0D, y + 3.0D, ThemeManager.getPrimaryColor(x * 12.0D), ThemeManager.getPrimaryColor((x + width + 4.0D) * 12.0D), ThemeManager.getPrimaryColor((x + width + 4.0D) * 12.0D), ThemeManager.getPrimaryColor(x * 12.0D));
            Global.Harry.getSmallMain().drawString(text, x + 3.0D, y + 3.0D + (double)this.Jacob.George(), ThemeHelper.getHeaderTextColor().getRGB());
            "".length();
            "".length();
            if (null != null) {
               return;
            }
         } else {
            Global.Harry.getSmallMain().drawString(text, x + 3.0D, y + 0.5D + (double)this.Jacob.George(), ThemeHelper.getHeaderTextColor().getRGB());
            "".length();
         }

         "".length();
         if ("".length() != "".length()) {
            return;
         }
         break;
      case Harry:
         var10000 = Global.Oliver.method_1562();
         if (mc.field_1724 != null) {
            var10001 = mc.field_1724.method_5667();
            "".length();
            if ("".length() >= " ".length()) {
               return;
            }
         } else {
            var10001 = null;
         }

         targetInfo = var10000.method_2871(var10001);
         if (targetInfo != null) {
            var29 = true;
            "".length();
            if (-"   ".length() > 0) {
               return;
            }
         } else {
            var29 = false;
         }

         hasPing = var29;
         ping = "";
         if (hasPing) {
            ping = String.valueOf((new StringBuilder()).append(targetInfo.method_2959()).append("ms"));
         }

         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
         LocalDateTime now = LocalDateTime.now();
         if (this.William.Jack()) {
            var32 = "zm";
            "".length();
            if ("  ".length() <= " ".length()) {
               return;
            }
         } else if (Global.Jack().q.isEnabled()) {
            var32 = "xxx_z4m0r05k4_xxx";
            "".length();
            if ((124 ^ 121) <= 0) {
               return;
            }
         } else {
            var32 = "zamorozka";
         }

         String textLogo = var32;
         var30 = (new StringBuilder()).append("§8 |§f ");
         if (mc.field_1724 != null) {
            var31 = mc.field_1724.method_7334().getName();
            "".length();
            if (-"  ".length() > 0) {
               return;
            }
         } else {
            var31 = "null";
         }

         text = String.valueOf(var30.append(var31).append("§8 |§f ").append(ping));
         if (Global.Jack().U.isEnabled()) {
            text = text.replaceAll(Global.Oliver.method_1548().method_1676(), Global.Jack().U.George());
         }

         y2 = (double)(Global.Harry.getSmallCirceRegular().getWidth(String.valueOf((new StringBuilder()).append(text).append("§8 |§f 22:22:22"))) + Global.Harry.getSmallCircleExtraBold().getWidth(textLogo.toUpperCase()) + 3.0F);
         actualWidth = (double)Math.max(Global.Harry.getSmallCirceRegular().getHeight(text), Global.Harry.getSmallCircleExtraBold().getHeight(String.valueOf((new StringBuilder()).append("§l").append(textLogo.toUpperCase()))));
         text = String.valueOf((new StringBuilder()).append(text).append("§8 |§f ").append(dtf.format(now)));
         actualHeight = 2.0D;
         x = ((double)mc.method_22683().method_4486() - y2) * this.Charlie.Oscar();
         y = ((double)mc.method_22683().method_4502() - actualWidth - actualHeight) * this.Charlie.James();
         double var10002 = x + y2 + 1.5D;
         double var10003 = y + actualWidth + actualHeight;
         int var10005;
         if (this.Mary.Jack()) {
            var10005 = -2046820352;
            "".length();
            if ("  ".length() >= (165 ^ 161)) {
               return;
            }
         } else {
            var10005 = (new Color(1316895)).getRGB();
         }

         RenderUtils.drawRoundedRect(x, y, var10002, var10003, 2.0D, var10005);
         int var33;
         if (this.James.Jack()) {
            var33 = ThemeManager.getPrimaryColor().getRGB();
            "".length();
            if (" ".length() != " ".length()) {
               return;
            }
         } else {
            var33 = -14046489;
         }

         int c = var33;
         TTFFontRenderer font = Global.Harry.getSmallCircleExtraBold();
         font.drawString(textLogo.toUpperCase(), x + 2.0999999046325684D, y + (double)this.Jacob.George() + (double)(font.getHeight(textLogo.toUpperCase()) / 4.0F), c);
         "".length();
         font.drawString(textLogo.toUpperCase(), x + 2.8499999046325684D, y + (double)this.Jacob.George() + (double)font.getHeight(textLogo.toUpperCase()) / 3.5D, -1);
         "".length();
         Global.Harry.getSmallCirceRegular().drawString(text, x + (double)Global.Harry.getSmallCircleExtraBold().getWidth(textLogo.toUpperCase()) + 1.0D, y + 1.5D + (double)this.Jacob.George(), -1);
         "".length();
         "".length();
         if (" ".length() < 0) {
            return;
         }
         break;
      case Jacob:
         var10000 = Global.Oliver.method_1562();
         if (mc.field_1724 != null) {
            var10001 = mc.field_1724.method_5667();
            "".length();
            if (null != null) {
               return;
            }
         } else {
            var10001 = null;
         }

         targetInfo = var10000.method_2871(var10001);
         if (targetInfo != null) {
            var29 = true;
            "".length();
            if ("".length() != 0) {
               return;
            }
         } else {
            var29 = false;
         }

         hasPing = var29;
         ping = "";
         if (hasPing) {
            ping = String.valueOf((new StringBuilder()).append(targetInfo.method_2959()).append("ms"));
         }

         var30 = new StringBuilder();
         if (Global.Jack().q.isEnabled()) {
            var31 = "xxx_z4m0r05k4_xxx";
            "".length();
            if ("".length() > (242 ^ 184 ^ 212 ^ 154)) {
               return;
            }
         } else {
            var31 = "zamorozka.fun";
         }

         var30 = var30.append(var31).append(" | ");
         if (mc.field_1724 != null) {
            var31 = mc.field_1724.method_7334().getName();
            "".length();
            if (null != null) {
               return;
            }
         } else {
            var31 = "null";
         }

         text = String.valueOf(var30.append(var31).append(" | ").append(mc.method_1562().method_2872().method_10755().toString().split("/")[0]).append(" | 20 tick | ").append(ping));
         if (Global.Jack().U.isEnabled()) {
            text = text.replaceAll(Global.Oliver.method_1548().method_1676(), Global.Jack().U.George());
         }

         width = (double)Global.Harry.getSmallMain().getWidth(text);
         double height = (double)Global.Harry.getSmallMain().getHeight(text);
         double x = ((double)mc.method_22683().method_4486() - width) * this.Charlie.Oscar();
         double y = ((double)mc.method_22683().method_4502() - height) * this.Charlie.James();
         RenderUtils.drawRect(x, y, x + width + 6.0D, y + height + 2.0D, new Color(3092533));
         Color c = ThemeManager.getPrimaryColor(x * 12.0D);
         RenderUtils.drawRoundedRectWithShadow(x, y, x + width + 6.0D, y + 2.0D, 0.0D, ThemeManager.getPrimaryColor(x * 12.0D).getRGB(), 1.0D, 1.0D, 15.0D, (new Color(c.getRed(), c.getGreen(), c.getBlue(), 120)).getRGB());
         RenderUtils.drawGradientRect(x, y, x + width + 6.0D, y + 2.0D, ThemeManager.getPrimaryColor(x * 12.0D), ThemeManager.getPrimaryColor((x + width + 4.0D) * 12.0D), ThemeManager.getPrimaryColor((x + width + 4.0D) * 12.0D), ThemeManager.getPrimaryColor(x * 12.0D));
         Global.Harry.getSmallMain().drawString(text, x + 3.0D, y + 2.0D + (double)this.Jacob.George(), (new Color(210, 210, 210)).getRGB());
         "".length();
      }

      "".length();
      if (-"   ".length() < 0) {
         ;
      }
   }

   public Watermark() {
      super("Watermark", "Shows a watermark on ur screen.", Category.Thomas);
      this.George = new EnumSetting("Line", Jack, LinePos.Harry);
      this.Oscar = new EnumSetting("Mode", Harry, Mode.Jack);
      this.James = new BooleanSetting("Accent Color", false);
      this.William = new BooleanSetting("Short Name", false);
      this.Mary = new BooleanSetting("Transparent bg", false);
      this.addSetting(this.Oscar);
      this.addSetting(this.Charlie);
      this.addSetting(this.Jacob);
      this.addSetting(new Splitter("skeet.cc settings", "Configuration for skeet.cc settings, outline rect, color line, etc."));
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(new Splitter("nl settings", "Configuration for nl-like watermark settings: text, colors."));
      this.addSetting(this.James);
      this.addSetting(this.William);
      this.addSetting(this.Mary);
      "".length();
      if ("".length() == -" ".length()) {
         throw null;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(Render2DListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }

   public String Oliver() {
      String var1 = Mode.Oliver(( Mode)this.Oscar.Harry());
      "".length();
      return "   ".length() < "   ".length() ? null : var1;
   }

   public static enum Mode {
      // $FF: synthetic field
      private final String Thomas;
      // $FF: synthetic field
      Oliver("Stroke"),
      // $FF: synthetic field
      Jacob("OT v2"),
      // $FF: synthetic field
      Charlie("skeet.cc"),
      // $FF: synthetic field
      Harry("NL-Like"),
      // $FF: synthetic field
      Jack("Small");

      public String toString() {
         String var1 = this.Thomas;
         "".length();
         return -(30 ^ 26) >= 0 ? null : var1;
      }

      private Mode(String name) {
         this.Thomas = name;
         "".length();
         if ("   ".length() <= "".length()) {
            throw null;
         }
      }

      static {
         "".length();
         if ((40 ^ 44) > "".length()) {
            ;
         }
      }

      // $FF: synthetic method
      static String Oliver( Mode x0) {
         String var1 = x0.Thomas;
         "".length();
         return "".length() != 0 ? null : var1;
      }
   }

   public static enum LinePos {
      // $FF: synthetic field
      Oliver("None");

      // $FF: synthetic field
      private final String Jacob;
      // $FF: synthetic field
      Jack("Up"),
      // $FF: synthetic field
      Harry("Down");

      static {
         "".length();
         if (-" ".length() != (64 ^ 44 ^ 118 ^ 30)) {
            ;
         }
      }

      private LinePos(String name) {
         this.Jacob = name;
         "".length();
         if ("   ".length() < "   ".length()) {
            throw null;
         }
      }

      public String toString() {
         String var1 = this.Jacob;
         "".length();
         return "  ".length() == "".length() ? null : var1;
      }
   }
}
