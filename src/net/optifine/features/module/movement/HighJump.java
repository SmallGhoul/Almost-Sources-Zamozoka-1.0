package net.optifine.features.module.movement;

import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.managers.event.events.UpdateListener;
import net.minecraft.class_243;
import net.minecraft.class_2828.class_2829;
import net.minecraft.class_746;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class HighJump extends Module implements UpdateListener {
   // $FF: synthetic field
   int Harry;
   // $FF: synthetic field
   private final EnumSetting< Mode> Jacob;
   // $FF: synthetic field
   private final NumberSetting Charlie;
   // $FF: synthetic field
   int Jack;
   // $FF: synthetic field
   private int Thomas;

   public String Oliver() {
      String var1 = Mode.Oliver(( Mode)this.Jacob.Harry());
      "".length();
      return " ".length() == "   ".length() ? null : var1;
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      this.Thomas = 0;
      this.Jack = 10;
      "".length();
      if ("   ".length() != 0) {
         ;
      }
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if (" ".length() > 0) {
         ;
      }
   }

   static {
      "".length();
      if ("   ".length() != 0) {
         ;
      }
   }

   private static int lIIIllIllll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public boolean George() {
      byte var10000;
      if (this.isEnabled() && this.Jacob.Harry() == Mode.Oliver) {
         var10000 = 1;
         "".length();
         if (-" ".length() > 0) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var1 = var10000;
      "".length();
      return (boolean)(" ".length() <= -" ".length() ? "".length() : var1);
   }

   public HighJump() {
      super("HighJump", "Allows to jump higher than legit players", Category.Jack);
      this.Jacob = new EnumSetting("Mode", Mode.values(), Mode.Oliver);
      this.Charlie = new NumberSetting("Jump Height", 0.42D, 0.01D, 10.0D, 0.01D);
      this.Jack = 0;
      this.Harry = 0;
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      "".length();
      if (-(128 ^ 149 ^ 64 ^ 81) > 0) {
         throw null;
      }
   }

   public float Oscar() {
      float var1 = this.Charlie.George();
      "".length();
      return "  ".length() == " ".length() ? 0.0F : var1;
   }

   public void Thomas() {
      class_746 player = mc.field_1724;
      if (!mc.field_1724.method_24828()) {
         ++this.Harry;
         "".length();
         if ("".length() != 0) {
            return;
         }
      } else {
         this.Harry = 0;
      }

      switch(( Mode)this.Jacob.Harry()) {
      case Jack:
         if (this.Thomas++ % 12 == 0) {
            player.method_18800(player.method_18798().field_1352, 0.4D, player.method_18798().field_1350);
            player.field_3944.method_2883(new class_2829(player.method_23317(), player.method_23318(), player.method_23321(), true));
         }

         if (this.Thomas++ % 16 == 0) {
            player.method_18800(player.method_18798().field_1352, 0.1D, player.method_18798().field_1350);
            player.field_3944.method_2883(new class_2829(player.method_23317(), player.method_23318(), player.method_23321(), false));
            "".length();
            if ("   ".length() == (1 ^ 114 ^ 204 ^ 187)) {
               return;
            }
         }
         break;
      case Jacob:
         player.field_7503.field_7479 = false;
         if (!mc.field_1724.method_24828() && mc.field_1690.field_1903.method_1434() && this.Thomas++ % 12 == 0) {
            player.method_18800(player.method_18798().field_1352, 2.1D, player.method_18798().field_1350);
            "".length();
            if ("".length() <= -" ".length()) {
               return;
            }
         }
         break;
      case Harry:
         player.field_7503.field_7479 = false;
         double posY = mc.field_1724.method_18798().method_10214();
         if (lIIIllIllll(posY, 0.33319999363422365D) == 0) {
            player.method_18800(player.method_18798().field_1352, 0.8D, player.method_18798().field_1350);
            "".length();
            if (" ".length() < " ".length()) {
               return;
            }
         }
         break;
      case Charlie:
         class_243 m = mc.field_1724.method_18798();
         if (this.Harry == 0) {
            mc.field_1724.method_18800(m.field_1352, 9.9D, m.field_1350);
            "".length();
            if ("  ".length() == -" ".length()) {
               return;
            }
         } else if (this.Harry == 1) {
            mc.field_1724.method_18800(m.field_1352, 3.0D, m.field_1350);
            "".length();
            if ("".length() >= "  ".length()) {
               return;
            }
         } else if (lIIIllIllll(m.field_1351, 0.0D) > 0) {
            mc.field_1724.method_18800(m.field_1352, 0.0D, m.field_1350);
            this.Oliver(false);
         }
      }

      ++this.Jack;
      "".length();
      if ("   ".length() != 0) {
         ;
      }
   }

   private static enum Mode {
      // $FF: synthetic field
      Jacob("JetMine"),
      // $FF: synthetic field
      Charlie("Vulcan"),
      // $FF: synthetic field
      Harry("MST"),
      // $FF: synthetic field
      Jack("SunRise"),
      // $FF: synthetic field
      Oliver("Vanilla");

      // $FF: synthetic field
      private final String Thomas;

      public String toString() {
         String var1 = this.Thomas;
         "".length();
         return "".length() != 0 ? null : var1;
      }

      // $FF: synthetic method
      static String Oliver( Mode x0) {
         String var1 = x0.Thomas;
         "".length();
         return "".length() > "   ".length() ? null : var1;
      }

      private Mode(String name) {
         this.Thomas = name;
         "".length();
         if ("  ".length() > (65 ^ 69)) {
            throw null;
         }
      }

      static {
         "".length();
         if ("  ".length() != -" ".length()) {
            ;
         }
      }
   }
}
