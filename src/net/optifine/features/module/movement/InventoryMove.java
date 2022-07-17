package net.optifine.features.module.movement;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.mixinterface.IKeyBinding;
import net.minecraft.class_408;
import net.minecraft.class_498;
import net.optifine.clickgui.screens.ClickGuiScreen;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class InventoryMove extends Module implements UpdateListener {
   // $FF: synthetic field
   BooleanSetting Jack = new BooleanSetting("ClickGui Only", false);

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if (" ".length() == " ".length()) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if ("".length() <= "  ".length()) {
         ;
      }
   }

   public void Thomas() {
      if (this.George()) {
         IKeyBinding keyForward = (IKeyBinding)mc.field_1690.field_1894;
         mc.field_1690.field_1894.method_23481(keyForward.isActallyPressed());
         IKeyBinding keyBack = (IKeyBinding)mc.field_1690.field_1881;
         mc.field_1690.field_1881.method_23481(keyBack.isActallyPressed());
         IKeyBinding keyLeft = (IKeyBinding)mc.field_1690.field_1913;
         mc.field_1690.field_1913.method_23481(keyLeft.isActallyPressed());
         IKeyBinding keyRight = (IKeyBinding)mc.field_1690.field_1849;
         mc.field_1690.field_1849.method_23481(keyRight.isActallyPressed());
         IKeyBinding keyJump = (IKeyBinding)mc.field_1690.field_1903;
         mc.field_1690.field_1903.method_23481(keyJump.isActallyPressed());
         IKeyBinding keySprint;
         if (Global.Jack().var2.isEnabled() && Global.Jack().var2.Thomas()) {
            keySprint = (IKeyBinding)mc.field_1690.field_1832;
            mc.field_1690.field_1832.method_23481(keySprint.isActallyPressed());
         }

         keySprint = (IKeyBinding)mc.field_1690.field_1867;
         mc.field_1690.field_1867.method_23481(keySprint.isActallyPressed());
      }

      "".length();
      if (-(141 ^ 137) < 0) {
         ;
      }
   }

   public InventoryMove() {
      super("InventoryMove", "Allows you to move with opened inventory");
      this.Oliver(Category.Jack);
      this.addSetting(this.Jack);
      "".length();
      if (-" ".length() == "   ".length()) {
         throw null;
      }
   }

   public boolean George() {
      byte var10000;
      label35: {
         if (mc.field_1755 != null) {
            label34: {
               if (this.Jack.Jack()) {
                  if (mc.field_1755 instanceof ClickGuiScreen) {
                     "".length();
                     if ("   ".length() <= " ".length()) {
                        return (boolean)"".length();
                     }
                     break label34;
                  }
               } else if (!(mc.field_1755 instanceof class_408) && !(mc.field_1755 instanceof class_498)) {
                  break label34;
               }

               var10000 = 0;
               break label35;
            }
         }

         var10000 = 1;
         "".length();
         if (" ".length() < 0) {
            return (boolean)"".length();
         }
      }

      byte var1 = var10000;
      "".length();
      return (boolean)("".length() != 0 ? "".length() : var1);
   }

   static {
      "".length();
      if ("".length() == 0) {
         ;
      }
   }
}
