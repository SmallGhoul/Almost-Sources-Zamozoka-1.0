package net.optifine.features.module.movement;

import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.managers.event.events.UpdateListener;
import net.minecraft.class_243;
import net.minecraft.class_746;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public final class FastClimb extends Module implements UpdateListener {
   // $FF: synthetic field
   private final EnumSetting< Mode> Harry;
   // $FF: synthetic field
   private final NumberSetting Charlie;
   // $FF: synthetic field
   int Jack;
   // $FF: synthetic field
   private final NumberSetting Jacob;

   static {
      "".length();
      if ("".length() < (38 + 14 - -24 + 96 ^ 133 + 83 - 56 + 8)) {
         ;
      }
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if ((139 ^ 142) != 0) {
         ;
      }
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      this.Jack = 0;
      "".length();
      if (" ".length() >= " ".length()) {
         ;
      }
   }

   public void Thomas() {
      class_746 player = mc.field_1724;
      if (player.method_6101() && player.field_5976) {
         class_243 m = player.method_18798();
         switch(( Mode)this.Harry.Harry()) {
         case Oliver:
            player.method_18800(m.field_1352, this.Charlie.Jack(), m.field_1350);
            "".length();
            if (-" ".length() >= "   ".length()) {
               return;
            }
            break;
         case Jack:
            if (this.Jack++ >= this.Jacob.Oscar()) {
               player.method_18800(m.field_1352, this.Charlie.Jack(), m.field_1350);
               this.Jack = 0;
            }
         }

         "".length();
         if (-" ".length() > "".length()) {
            return;
         }
      } else {
         "".length();
         if (-"  ".length() > 0) {
            return;
         }
      }

   }

   public FastClimb() {
      super("FastClimb", "Allows you to climb up ladders and vines faster.");
      this.Harry = new EnumSetting("Mode", Mode.values(), Mode.Oliver);
      this.Jacob = new NumberSetting("Tick Delay", 10.0D, 1.0D, 60.0D, 1.0D);
      this.Charlie = new NumberSetting("Speed", 0.15D, 0.12D, 10.0D, 0.01D);
      this.Jack = 0;
      this.Oliver(Category.Jack);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      "".length();
      if ("  ".length() <= 0) {
         throw null;
      }
   }

   private static enum Mode {
      // $FF: synthetic field
      private final String Harry;
      // $FF: synthetic field
      Oliver("Vanilla"),
      // $FF: synthetic field
      Jack("Tick");

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return -" ".length() > "  ".length() ? null : var1;
      }

      private Mode(String name) {
         this.Harry = name;
         "".length();
         if (-" ".length() > 0) {
            throw null;
         }
      }

      static {
         "".length();
         if ("".length() == 0) {
            ;
         }
      }
   }
}
