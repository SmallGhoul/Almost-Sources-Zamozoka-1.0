package net.optifine.features.module.hud;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.config.ColorPickerSetting;
import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.util.render.Texture;
import net.optifine.util.theme.Theme;
import net.optifine.util.theme.ThemeManager.SelectedScheme;
import net.optifine.clickgui.screens.ClickGuiScreen;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.awt.*;

public final class ClickGuiModule extends Module {
   // $FF: synthetic field
   private final EnumSetting< ClientFont> Charlie;
   // $FF: synthetic field
   private final EnumSetting<SelectedScheme> Jennifer;
   // $FF: synthetic field
   private final NumberSetting Patricia;
   // $FF: synthetic field
   private final ColorPickerSetting Linda;
   // $FF: synthetic field
   private final EnumSetting< WallPaper> Jacob;
   // $FF: synthetic field
   private final BooleanSetting George;
   // $FF: synthetic field
   public final BooleanSetting Harry;
   // $FF: synthetic field
   private final BooleanSetting Oscar;
   // $FF: synthetic field
   private final NumberSetting Mary;
   // $FF: synthetic field
   private final EnumSetting< Translation> Thomas;
   // $FF: synthetic field
   private final EnumSetting<Theme> Barbara;
   // $FF: synthetic field
   private final BooleanSetting James;
   // $FF: synthetic field
   private final BooleanSetting William;
   // $FF: synthetic field
   private final ColorPickerSetting Elizabeth;
   // $FF: synthetic field
   public final BooleanSetting Jack = new BooleanSetting("Use dots and commas", false);

   public Color Patricia() {
      Color var1 = this.Elizabeth.Oscar();
      "".length();
      return -" ".length() > "   ".length() ? null : var1;
   }

   public Color Jennifer() {
      Color var1 = this.Linda.Oscar();
      "".length();
      return -"  ".length() > 0 ? null : var1;
   }

   public Translation Thomas() {
      Translation var1 = ( Translation)this.Thomas.Harry();
      "".length();
      return -"   ".length() > 0 ? null : var1;
   }

   public boolean Linda() {
      byte var1 = this.Oscar.Jack();
      "".length();
      return (boolean)(-"   ".length() >= 0 ? "".length() : var1);
   }

   public void Jacob() {
      if (!(mc.field_1755 instanceof ClickGuiScreen)) {
         mc.method_1507(new ClickGuiScreen(Global.Charlie()));
      }

      this.Jack(false);
      "".length();
      if ("   ".length() >= "   ".length()) {
         ;
      }
   }

   public SelectedScheme Mary() {
      SelectedScheme var1 = (SelectedScheme)this.Jennifer.Harry();
      "".length();
      return "".length() > "  ".length() ? null : var1;
   }

   public Theme George() {
      Theme var1 = (Theme)this.Barbara.Harry();
      "".length();
      return (212 ^ 159 ^ 111 ^ 33) <= 0 ? null : var1;
   }

   public boolean James() {
      byte var1 = this.George.Jack();
      "".length();
      return (boolean)(" ".length() == 0 ? "".length() : var1);
   }

   public ClientFont Susan() {
      ClientFont var1 = ( ClientFont)this.Charlie.Harry();
      "".length();
      return -" ".length() >= " ".length() ? null : var1;
   }

   public float Barbara() {
      float var1 = this.Patricia.George();
      "".length();
      return -" ".length() >= (6 ^ 99 ^ 232 ^ 137) ? 0.0F : var1;
   }

   public float Elizabeth() {
      float var1 = this.Mary.George();
      "".length();
      return (10 ^ 106 ^ 253 ^ 153) <= "  ".length() ? 0.0F : var1;
   }

   public boolean Margaret() {
      byte var1 = this.William.Jack();
      "".length();
      return (boolean)(null != null ? "".length() : var1);
   }

   public WallPaper Oscar() {
      WallPaper var1 = ( WallPaper)this.Jacob.Harry();
      "".length();
      return (216 ^ 129 ^ 112 ^ 45) != (41 + 142 - 117 + 85 ^ 146 + 131 - 254 + 124) ? null : var1;
   }

   public boolean William() {
      byte var1 = this.James.Jack();
      "".length();
      return (boolean)("  ".length() == 0 ? "".length() : var1);
   }

   static {
      "".length();
      if (" ".length() == " ".length()) {
         ;
      }
   }

   public ClickGuiModule() {
      super("GUI", "GUI Settings", Category.Thomas);
      this.Jacob = new EnumSetting("Wall Paper", WallPaper.values(), WallPaper.Oliver);
      this.Charlie = new EnumSetting("Font", ClientFont.values(), ClientFont.Oliver);
      this.Thomas = new EnumSetting("Language", Translation.values(), Translation.Oliver);
      this.George = new BooleanSetting("Use Gradient", true);
      this.Harry = new BooleanSetting("Use shadows", false);
      this.Oscar = new BooleanSetting("Outline", false);
      this.James = new BooleanSetting("Use Screen", false);
      this.William = new BooleanSetting("Microsoft Style", true);
      this.Mary = new NumberSetting("Color Spread", 5.0D, 1.0D, 30.0D, 0.1D);
      this.Patricia = new NumberSetting("Color Speed", 2.0D, 0.5D, 15.0D, 0.1D);
      this.Jennifer = new EnumSetting("Theme", SelectedScheme.values(), SelectedScheme.COLD);
      this.Elizabeth = new ColorPickerSetting("Primary color");
      this.Linda = new ColorPickerSetting("Secondary color");
      this.Barbara = new EnumSetting("Preset", Theme.values(), Theme.DARK);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.James);
      this.addSetting(this.George);
      this.addSetting(this.Oscar);
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      this.addSetting(this.William);
      this.addSetting(this.Barbara);
      this.addSetting(this.Mary);
      this.addSetting(this.Patricia);
      this.addSetting(this.Jennifer);
      this.addSetting(this.Elizabeth);
      this.addSetting(this.Linda);
      "".length();
      if ("  ".length() != "  ".length()) {
         throw null;
      }
   }

   public static enum WallPaper {
      // $FF: synthetic field
      Jack("Generic", new Texture("/assets/zamorozka/girls/generic.png"), 4.0D),
      // $FF: synthetic field
      George("Siesta", new Texture("/assets/zamorozka/girls/siesta.png"), 8.0D),
      // $FF: synthetic field
      Oscar("Venti", new Texture("/assets/zamorozka/girls/venti.png"), 14.0D),
      // $FF: synthetic field
      Oliver("None", (Texture)null, 1.0D);

      // $FF: synthetic field
      private final String Jennifer;
      // $FF: synthetic field
      Harry("Garbage", new Texture("/assets/zamorozka/girls/garbage.png"), 6.0D);

      // $FF: synthetic field
      private final double Linda;
      // $FF: synthetic field
      Patricia("Horny", new Texture("/assets/zamorozka/girls/horny.png"), 3.5D),
      // $FF: synthetic field
      James("Dead Inside", new Texture("/assets/zamorozka/girls/deadinside.png"), 2.5D),
      // $FF: synthetic field
      Charlie("Klee", new Texture("/assets/zamorozka/girls/klee.png"), 3.0D),
      // $FF: synthetic field
      Mary("Raftalia", new Texture("/assets/zamorozka/girls/raftalia.png"), 12.0D),
      // $FF: synthetic field
      Thomas("Yui", new Texture("/assets/zamorozka/girls/yui.png"), 12.0D),
      // $FF: synthetic field
      Jacob("Kuriyama", new Texture("/assets/zamorozka/girls/kuriyama.png"), 2.2D),
      // $FF: synthetic field
      William("Loli-1", new Texture("/assets/zamorozka/girls/loli.png"), 6.0D);

      // $FF: synthetic field
      private final Texture Elizabeth;

      public Texture Oliver() {
         Texture var1 = this.Elizabeth;
         "".length();
         return "   ".length() >= (62 + 38 - -28 + 23 ^ 99 + 137 - 200 + 111) ? null : var1;
      }

      private WallPaper(String name, Texture texture, double scaling) {
         this.Jennifer = name;
         this.Elizabeth = texture;
         this.Linda = scaling;
         "".length();
         if ("   ".length() > (211 ^ 183 ^ 227 ^ 131)) {
            throw null;
         }
      }

      static {
         "".length();
         if (" ".length() != 0) {
            ;
         }
      }

      public String toString() {
         String var1 = this.Jennifer;
         "".length();
         return -" ".length() >= "".length() ? null : var1;
      }
   }

   public static enum Translation {
      // $FF: synthetic field
      Jack("RU");

      // $FF: synthetic field
      private final String Harry;
      // $FF: synthetic field
      Oliver("EN");

      private Translation(String ru) {
         this.Harry = ru;
         "".length();
         if (" ".length() <= 0) {
            throw null;
         }
      }

      static {
         "".length();
         if (" ".length() > 0) {
            ;
         }
      }
   }

   public static enum ClientFont {
      // $FF: synthetic field
      George("Menlo"),
      // $FF: synthetic field
      Thomas("MineCraft"),
      // $FF: synthetic field
      Harry("Montserrat");

      // $FF: synthetic field
      private final String William;
      // $FF: synthetic field
      Jack("Arial"),
      // $FF: synthetic field
      Jacob("Ubuntu"),
      // $FF: synthetic field
      Oliver("Comfortaa"),
      // $FF: synthetic field
      James("Circe-Regular"),
      // $FF: synthetic field
      Charlie("Roboto"),
      // $FF: synthetic field
      Oscar("OpenSans");

      public String toString() {
         String var1 = this.William;
         "".length();
         return "  ".length() < 0 ? null : var1;
      }

      private ClientFont(String name) {
         this.William = name;
         "".length();
         if ("".length() != 0) {
            throw null;
         }
      }

      static {
         "".length();
         if ("   ".length() > 0) {
            ;
         }
      }
   }
}
