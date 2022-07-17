package net.optifine.features.module.hud;

import net.optifine.Global;
import net.optifine.config.*;
import net.optifine.util.font.FontManager;
import net.optifine.util.font.TTFFontRenderer;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public final class ArrayListModule extends Module {
   // $FF: synthetic field
   private final BooleanSetting Elizabeth;
   // $FF: synthetic field
   private final EnumSetting< ClientFont> Harry;
   // $FF: synthetic field
   private final BooleanSetting James;
   // $FF: synthetic field
   private final EnumSetting< SortMode> Thomas;
   // $FF: synthetic field
   private final BooleanSetting Charlie;
   // $FF: synthetic field
   private final NumberSetting Barbara;
   // $FF: synthetic field
   private final BooleanSetting William;
   // $FF: synthetic field
   private final EnumSetting< Spacing> Jennifer;
   // $FF: synthetic field
   private final NumberSetting Linda;
   // $FF: synthetic field
   private final BooleanSetting Jacob;
   // $FF: synthetic field
   private final NumberSetting Susan;
   // $FF: synthetic field
   private final BooleanSetting Mary;
   // $FF: synthetic field
   public final BooleanSetting Jack;
   // $FF: synthetic field
   private final EnumSetting< LineMode> Patricia;
   // $FF: synthetic field
   private final BooleanSetting Oscar;
   // $FF: synthetic field
   private final NumberSetting Margaret;
   // $FF: synthetic field
   private final BooleanSetting George;
   // $FF: synthetic field
   private final DoubleSliderSetting Jessica;

   public boolean Thomas() {
      byte var1 = this.William.Jack();
      "".length();
      return (boolean)(" ".length() <= -" ".length() ? "".length() : var1);
   }

   public boolean George() {
      byte var1 = this.Mary.Jack();
      "".length();
      return (boolean)("  ".length() < "  ".length() ? "".length() : var1);
   }

   public double Susan() {
      double var1 = (double)this.Margaret.George();
      "".length();
      return -"  ".length() >= 0 ? 0.0D : var1;
   }

   public ArrayListModule() {
      super("ArrayList", "Shows all turned on modules for this moment", Category.Thomas);
      this.Harry = new EnumSetting("Base Font", ClientFont.values(), ClientFont.James);
      this.Jacob = new BooleanSetting("Small Font", true);
      this.Charlie = new BooleanSetting("Font Shadow", true);
      this.Thomas = new EnumSetting("Sort mode", SortMode.values(), SortMode.Oliver);
      this.George = new BooleanSetting("Ignore Render", true);
      this.Oscar = new BooleanSetting("Draw Rect", true);
      this.James = new BooleanSetting("Show Suffix", true);
      this.William = new BooleanSetting("Replace KillAura with Aura", true);
      this.Mary = new BooleanSetting("Module Names with Spaces", false);
      this.Patricia = new EnumSetting("Line Mode", LineMode.values(), LineMode.Jack);
      this.Jennifer = new EnumSetting("Spacing Mode", Spacing.values(), Spacing.Oliver);
      this.Elizabeth = new BooleanSetting("Draw Background", true);
      this.Jack = new BooleanSetting("Shaders", true);
      this.Linda = new NumberSetting("Background Brightness", 0.1D, 0.0D, 1.0D, 0.01D);
      this.Barbara = new NumberSetting("Background Alpha", 0.6D, 0.0D, 1.0D, 0.01D);
      this.Susan = new NumberSetting("Height", 0.0D, -5.0D, 5.0D, 0.01D);
      this.Margaret = new NumberSetting("Rect Width", 1.7D, 0.1D, 5.0D, 0.01D);
      this.Jessica = new DoubleSliderSetting("ArrayList Position", 1.0D, 0.0D);
      this.addSetting(new Splitter("Font"));
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(new Splitter("General"));
      this.addSetting(this.Thomas);
      this.addSetting(this.Oscar);
      this.addSetting(this.George);
      this.addSetting(new Splitter("Text"));
      this.addSetting(this.Jennifer);
      this.addSetting(this.James);
      this.addSetting(this.William);
      this.addSetting(this.Mary);
      this.addSetting(new Splitter("Visual"));
      this.addSetting(this.Jack);
      this.addSetting(this.Elizabeth);
      this.addSetting(this.Linda);
      this.addSetting(this.Barbara);
      this.addSetting(this.Patricia);
      this.addSetting(this.Susan);
      this.addSetting(this.Margaret);
      this.addSetting(this.Jessica);
      "".length();
      if ((63 ^ 59) < (53 ^ 49)) {
         throw null;
      }
   }

   public boolean Jessica() {
      byte var10000;
      if (this.James() == LineMode.Jacob) {
         var10000 = 1;
         "".length();
         if ("".length() != 0) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var1 = var10000;
      "".length();
      return (boolean)(-(68 ^ 64) >= 0 ? "".length() : var1);
   }

   public Spacing JaCk() {
      Spacing var1 = ( Spacing)this.Jennifer.Harry();
      "".length();
      return null != null ? null : var1;
   }

   static {
      "".length();
      if ("  ".length() != "".length()) {
         ;
      }
   }

   public String Oliver() {
      String var1 = ClientFont.Oliver(( ClientFont)this.Harry.Harry());
      "".length();
      return -"  ".length() >= 0 ? null : var1;
   }

   public TTFFontRenderer JacoB() {
      FontManager fm = Global.Harry;
      TTFFontRenderer var2;
      if (Global.Jack() == null) {
         var2 = fm.genericComfortaa;
         "".length();
         if ("".length() < -" ".length()) {
            return null;
         }
      } else {
         switch(( ClientFont)this.Harry.Harry()) {
         case Oliver:
            var2 = fm.genericComfortaa;
            "".length();
            if ("".length() > 0) {
               return null;
            }
            break;
         case Harry:
            var2 = fm.genericMonsttrrr;
            "".length();
            if (null != null) {
               return null;
            }
            break;
         case Jack:
            var2 = fm.genericArial;
            "".length();
            if (-" ".length() > -" ".length()) {
               return null;
            }
            break;
         case George:
            var2 = fm.genericMenlo;
            "".length();
            if (-(210 ^ 165 ^ 111 ^ 28) >= 0) {
               return null;
            }
            break;
         case Thomas:
            var2 = fm.genericMinecraft;
            "".length();
            if ("  ".length() == (131 ^ 135)) {
               return null;
            }
            break;
         case Jacob:
            var2 = fm.genericUbuntu;
            "".length();
            if ("".length() != 0) {
               return null;
            }
            break;
         case Charlie:
            var2 = fm.genericRoboto;
            "".length();
            if ("".length() == "  ".length()) {
               return null;
            }
            break;
         case James:
            var2 = fm.genericOpenSans;
            "".length();
            if ("   ".length() < -" ".length()) {
               return null;
            }
            break;
         case Oscar:
            var2 = fm.circeRegular;
            "".length();
            if (-" ".length() > (103 ^ 99)) {
               return null;
            }
            break;
         default:
            var2 = null;
            "".length();
            if (-"   ".length() >= 0) {
               return null;
            }
         }
      }

      return var2;
   }

   public SortMode OlIver() {
      SortMode var1 = ( SortMode)this.Thomas.Harry();
      "".length();
      return -"  ".length() >= 0 ? null : var1;
   }

   public double Barbara() {
      double var1 = (double)this.Susan.George();
      "".length();
      return "".length() != 0 ? 0.0D : var1;
   }

   public LineMode James() {
      LineMode var1 = ( LineMode)this.Patricia.Harry();
      "".length();
      return -"  ".length() > 0 ? null : var1;
   }

   public TTFFontRenderer HaRry() {
      FontManager fm = Global.Harry;
      TTFFontRenderer var2;
      if (Global.Jack() == null) {
         var2 = fm.smallComfotraa;
         "".length();
         if (-" ".length() == (147 ^ 131 ^ 98 ^ 118)) {
            return null;
         }
      } else {
         switch(( ClientFont)this.Harry.Harry()) {
         case Oliver:
            var2 = fm.smallComfotraa;
            "".length();
            if (-(64 ^ 69) >= 0) {
               return null;
            }
            break;
         case Harry:
            var2 = fm.smallMonsttrrr;
            "".length();
            if ((165 ^ 161) != (81 ^ 85)) {
               return null;
            }
            break;
         case Jack:
            var2 = fm.smallArial;
            "".length();
            if ("".length() != 0) {
               return null;
            }
            break;
         case George:
            var2 = fm.smallMenlo;
            "".length();
            if ("  ".length() < " ".length()) {
               return null;
            }
            break;
         case Thomas:
            var2 = fm.smallMinecraft;
            "".length();
            if ("   ".length() < 0) {
               return null;
            }
            break;
         case Jacob:
            var2 = fm.smallUbuntu;
            "".length();
            if ("  ".length() == " ".length()) {
               return null;
            }
            break;
         case Charlie:
            var2 = fm.smallRoboto;
            "".length();
            if (-(134 ^ 131) >= 0) {
               return null;
            }
            break;
         case James:
            var2 = fm.smallOpenSans;
            "".length();
            if (-(49 ^ 83 ^ 35 ^ 69) > 0) {
               return null;
            }
            break;
         case Oscar:
            var2 = fm.smallCirceRegular;
            "".length();
            if ("   ".length() == 0) {
               return null;
            }
            break;
         default:
            var2 = null;
            "".length();
            if (null != null) {
               return null;
            }
         }
      }

      return var2;
   }

   public boolean Elizabeth() {
      byte var1 = this.Charlie.Jack();
      "".length();
      return (boolean)((50 ^ 85 ^ 218 ^ 185) < (172 ^ 179 ^ 7 ^ 28) ? "".length() : var1);
   }

   public float William() {
      float var1 = this.Barbara.George();
      "".length();
      return "".length() > 0 ? 0.0F : var1;
   }

   public boolean Sarah() {
      byte var1 = this.Oscar.Jack();
      "".length();
      return (boolean)(null != null ? "".length() : var1);
   }

   public boolean Oscar() {
      byte var1 = this.James.Jack();
      "".length();
      return (boolean)(null != null ? "".length() : var1);
   }

   public boolean Patricia() {
      byte var1 = this.George.Jack();
      "".length();
      return (boolean)((89 ^ 93) <= "   ".length() ? "".length() : var1);
   }

   public double Linda() {
      double var1 = this.Jessica.James();
      "".length();
      return -"   ".length() > 0 ? 0.0D : var1;
   }

   public double Margaret() {
      double var1 = this.Jessica.Oscar();
      "".length();
      return "  ".length() >= "   ".length() ? 0.0D : var1;
   }

   public float Mary() {
      float var1 = this.Linda.George();
      "".length();
      return (84 ^ 80) < 0 ? 0.0F : var1;
   }

   public boolean Jennifer() {
      byte var1 = this.Elizabeth.Jack();
      "".length();
      return (boolean)((30 ^ 44 ^ 180 ^ 130) > (95 ^ 106 ^ 39 ^ 22) ? "".length() : var1);
   }

   public TTFFontRenderer CharliE() {
      TTFFontRenderer var10000;
      if (this.Jacob.Jack()) {
         var10000 = this.HaRry();
         "".length();
         if (null != null) {
            return null;
         }
      } else {
         var10000 = this.JacoB();
      }

      TTFFontRenderer var1 = var10000;
      "".length();
      return " ".length() == 0 ? null : var1;
   }

   public static enum LineMode {
      // $FF: synthetic field
      Harry("Full"),
      // $FF: synthetic field
      Jack("Small"),
      // $FF: synthetic field
      Oliver("None");

      // $FF: synthetic field
      private final String Charlie;
      // $FF: synthetic field
      Jacob("Outline");

      private LineMode(String name) {
         this.Charlie = name;
         "".length();
         if (-" ".length() >= "".length()) {
            throw null;
         }
      }

      static {
         "".length();
         if ((111 ^ 106) != 0) {
            ;
         }
      }

      public String toString() {
         String var1 = this.Charlie;
         "".length();
         return (25 ^ 28) <= 0 ? null : var1;
      }
   }

   public static enum SortMode {
      // $FF: synthetic field
      private final String Harry;
      // $FF: synthetic field
      Jack("Alphabet"),
      // $FF: synthetic field
      Oliver("Width");

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return "".length() != 0 ? null : var1;
      }

      private SortMode(String name) {
         this.Harry = name;
         "".length();
         if ((32 ^ 68 ^ 97 ^ 1) <= 0) {
            throw null;
         }
      }

      static {
         "".length();
         if (null == null) {
            ;
         }
      }
   }

   public static enum Spacing {
      // $FF: synthetic field
      Oscar("OwO-UwU", "§7 OwO~~ "),
      // $FF: synthetic field
      Harry("Line", "§7 | "),
      // $FF: synthetic field
      Jack("Blank", "§7 - "),
      // $FF: synthetic field
      Thomas("Strip Arrow", "§7 -> "),
      // $FF: synthetic field
      Jacob("Arrow", "§7 >> ");

      // $FF: synthetic field
      private final String William;
      // $FF: synthetic field
      Oliver("Basic", "§7 "),
      // $FF: synthetic field
      George("Hash", "§7 # "),
      // $FF: synthetic field
      Charlie("Slash", "§7 // ");

      // $FF: synthetic field
      private final String James;

      public String toString() {
         String var1 = this.James;
         "".length();
         return "  ".length() == "".length() ? null : var1;
      }

      public String Oliver() {
         String var1 = this.William;
         "".length();
         return "  ".length() < "  ".length() ? null : var1;
      }

      private Spacing(String name, String spacing) {
         this.James = name;
         this.William = spacing;
         "".length();
         if ((168 ^ 172) == 0) {
            throw null;
         }
      }

      static {
         "".length();
         if ((74 ^ 44 ^ 5 ^ 103) > "   ".length()) {
            ;
         }
      }
   }

   public static enum ClientFont {
      // $FF: synthetic field
      George("Menlo"),
      // $FF: synthetic field
      Oliver("Comfortaa"),
      // $FF: synthetic field
      Jacob("Ubuntu");

      // $FF: synthetic field
      private final String William;
      // $FF: synthetic field
      Thomas("MineCraft"),
      // $FF: synthetic field
      Charlie("Roboto"),
      // $FF: synthetic field
      Oscar("Circe-Regular"),
      // $FF: synthetic field
      Jack("Arial"),
      // $FF: synthetic field
      James("OpenSans"),
      // $FF: synthetic field
      Harry("Montserrat");

      private ClientFont(String name) {
         this.William = name;
         "".length();
         if ("  ".length() == (74 + 33 - -5 + 59 ^ 48 + 81 - 31 + 77)) {
            throw null;
         }
      }

      public String toString() {
         String var1 = this.William;
         "".length();
         return "  ".length() < 0 ? null : var1;
      }

      // $FF: synthetic method
      static String Oliver( ClientFont x0) {
         String var1 = x0.William;
         "".length();
         return "  ".length() == 0 ? null : var1;
      }

      static {
         "".length();
         if (null == null) {
            ;
         }
      }
   }
}
