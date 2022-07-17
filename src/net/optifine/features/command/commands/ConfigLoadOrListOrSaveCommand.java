package net.optifine.features.command.commands;

import net.optifine.Global;
import net.optifine.util.ChatUtils;
import net.optifine.util.json.JsonException;
import net.optifine.util.math.MathUtils;
import net.optifine.features.command.exception.CommandError;
import net.optifine.features.command.exception.CommandException;
import net.optifine.features.command.exception.CommandSyntaxError;
import net.optifine.features.command.util.AbstractCommand;
import net.optifine.features.module.hud.ClickGuiModule;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;

public final class ConfigLoadOrListOrSaveCommand extends AbstractCommand {
   public ConfigLoadOrListOrSaveCommand() {
      super("config", "", ".config load <name>", ".config save <name>", ".config list [<page>]");
      "".length();
      if (" ".length() <= 0) {
         throw null;
      }
   }

   private void Harry(String[] args) throws CommandException {
      if (args.length != 2) {
         throw new CommandSyntaxError();
      } else {
         String name = this.Oliver(args[1]);
         if (Global.Thomas.Jack.Harry) {
            if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
               ChatUtils.message("Unnable to save private config!");
               "".length();
               if ("   ".length() < 0) {
                  return;
               }
            } else {
               ChatUtils.message("Невозможно сохранить приватную конфигурацию!");
            }

            "".length();
            if ("   ".length() <= "  ".length()) {
               return;
            }
         } else {
            try {
               zamorozka.Oliver(name, new String[0], false);
               if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
                  ChatUtils.message("Config saved!");
                  "".length();
                  if (-(181 ^ 177) > 0) {
                     return;
                  }
               } else {
                  ChatUtils.message("Конфигурация сохранена!");
               }
            } catch (JsonException | IOException var4) {
               var4.printStackTrace();
               if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
                  throw new CommandError(String.valueOf((new StringBuilder()).append("Couldn't save config: ").append(var4.getMessage())));
               }

               throw new CommandError(String.valueOf((new StringBuilder()).append("Проблема во время сохранения: ").append(var4.getMessage())));
            }

            "".length();
            if (" ".length() <= 0) {
               return;
            }

            "".length();
            if ("   ".length() == (62 ^ 14 ^ 99 ^ 87)) {
               return;
            }
         }

      }
   }

   public void Oliver(String[] args) throws CommandException {
      if (args.length < 1) {
         throw new CommandSyntaxError();
      } else {
         String var2 = args[0].toLowerCase();
         byte var3 = -1;
         switch(var2.hashCode()) {
         case 3322014:
            if (Integer.valueOf(3322014).equals(var2.hashCode())) {
               var3 = 2;
            }
            break;
         case 3327206:
            if (Integer.valueOf(3327206).equals(var2.hashCode())) {
               var3 = 0;
               "".length();
               if ("  ".length() <= 0) {
                  return;
               }
            }
            break;
         case 3522941:
            if (Integer.valueOf(3522941).equals(var2.hashCode())) {
               var3 = 1;
               "".length();
               if ((9 ^ 12) <= 0) {
                  return;
               }
            }
         }

         switch(var3) {
         case 0:
            this.Jack(args);
            "".length();
            if ((47 ^ 43) < -" ".length()) {
               return;
            }
            break;
         case 1:
            this.Harry(args);
            "".length();
            if ("".length() != 0) {
               return;
            }
            break;
         case 2:
            this.Jacob(args);
            "".length();
            if (-(87 ^ 82) >= 0) {
               return;
            }
            break;
         default:
            throw new CommandSyntaxError();
         }

         "".length();
         if (null == null) {
            ;
         }
      }
   }

   private int Charlie(String[] args) throws CommandSyntaxError {
      int var2;
      if (args.length < 2) {
         var2 = 1;
         "".length();
         if ("   ".length() <= "".length()) {
            return "".length();
         }
      } else {
         if (!MathUtils.isInteger(args[1])) {
            throw new CommandSyntaxError("Invalid page!");
         }

         var2 = Integer.parseInt(args[1]);
         "".length();
         if ((38 ^ 11 ^ 30 ^ 55) != (100 ^ 71 ^ 47 ^ 8)) {
            return "".length();
         }
      }

      return var2;
   }

   private void Jack(String[] args) throws CommandException {
      if (args.length != 2) {
         throw new CommandSyntaxError();
      } else {
         String name = this.Oliver(args[1]);

         try {
            label58: {
               try {
                  zamorozka.Jack(name);
                  if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
                     ChatUtils.message("Config loaded!");
                     "".length();
                     if (-" ".length() < -" ".length()) {
                        return;
                     }
                  } else {
                     ChatUtils.message("Конфигурация загружена!");
                  }
               } catch (IllegalAccessError var4) {
                  if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
                     ChatUtils.message("Failed while loading config!");
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else {
                     ChatUtils.message("Ошибка загрузки конфигурации!");
                  }
                  break label58;
               }

               "".length();
               if ("".length() != 0) {
                  return;
               }
            }
         } catch (NoSuchFileException var5) {
            if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
               throw new CommandError("Config doesn't exist!");
            }

            throw new CommandError("Данной конфигурации не существует!");
         } catch (JsonException var6) {
            var6.printStackTrace();
            if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
               throw new CommandError("Invalid config!");
            }

            throw new CommandError("Неверное содержание конфигурации!");
         } catch (IOException var7) {
            var7.printStackTrace();
            if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
               throw new CommandError(String.valueOf((new StringBuilder()).append("Error loading config: ").append(var7.getMessage())));
            }

            throw new CommandError(String.valueOf((new StringBuilder()).append("Проблема во время загрузки: ").append(var7.getMessage())));
         }

         "".length();
         if ((44 ^ 40) != 0) {
            "".length();
            if ("".length() != -" ".length()) {
               ;
            }
         }
      }
   }

   private String Oliver(String input) {
      String fileName = input;
      if (!input.endsWith(".json")) {
         fileName = String.valueOf((new StringBuilder()).append(input).append(".json"));
      }

      "".length();
      return "  ".length() == "".length() ? null : fileName;
   }

   private void Jacob(String[] args) throws CommandException {
      if (args.length > 2) {
         throw new CommandSyntaxError();
      } else {
         ArrayList<Path> files = zamorozka.Oscar();
         int page = this.Charlie(args);
         int pages = (int)Math.ceil((double)files.size() / 8.0D);
         pages = Math.max(pages, 1);
         if (page <= pages && page >= 1) {
            int start = (page - 1) * 8;
            int end = Math.min(page * 8, files.size());
            if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
               ChatUtils.message(String.valueOf((new StringBuilder()).append("Configs page ").append(page).append(" / ").append(pages)));
               "".length();
               if ((216 ^ 139 ^ 97 ^ 54) != (28 + 0 - -54 + 56 ^ 67 + 3 - 42 + 114)) {
                  return;
               }
            } else {
               ChatUtils.message(String.valueOf((new StringBuilder()).append("Доступные страницы ").append(page).append(" / ").append(pages)));
            }

            int i = start;

            do {
               if (i >= end) {
                  "".length();
                  if ("".length() > "   ".length()) {
                     return;
                  }

                  return;
               }

               ChatUtils.message(((Path)files.get(i)).getFileName().toString());
               ++i;
               "".length();
            } while("".length() < "  ".length());

         } else if (Global.Jack().Elizabeth.Thomas() == ClickGuiModule.Translation.Oliver) {
            throw new CommandSyntaxError("Page doesn't exist!");
         } else {
            throw new CommandSyntaxError("Такой страницы не существует!");
         }
      }
   }

   static {
      "".length();
      if ("   ".length() > " ".length()) {
         ;
      }
   }
}
