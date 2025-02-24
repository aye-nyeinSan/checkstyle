package com.google.checkstyle.test.chapter4formatting.rule4861blockcommentstyle;

/** some javadoc. */
public class InputFormattedCommentsIndentationInSwitchBlock {

  private static void fooSwitch() {
    switch ("") {
      case "0": // some comment
      case "1":
        // my comment
        foo1();
        break;
      case "2":
        // my comment
        // comment
        foo1();
        // comment
        break;
      case "3":
        /* // odd indentation comment
         *  */

        foo1();
        /* com */
        break;
      case "5":
        foo1();
        // odd indentation comment
        break;
      case "6":
        int k = 7;
      // fall through
      case "7":
        if (true) {
          /* foo */
        }
        // odd indentation comment
        break;
      case "8":
        break;
      case "9":
        foo1();
      // fall through
      case "10":
        {
          if (true) {
            /* foo */
          }
        }
      // fall through
      case "11":
        {
        }
      // fall through
      case "28":
        {
        }
      // fall through
      case "12":
        {
          // odd indentation comment

          int i;
        }
        break;
      case "13":
        {
          // some comment in empty case block
        }
        break;
      case "14":
        {
          // odd indentation comment

        }
        break;
      case "15":
        {
          foo1();
          // odd indentation comment
        }
        break;
      case "16":
        {
          int a;
        }
      // fall through
      case "17":
        {
          int a;
        }

        // odd indentation comment
        break;
      case "18":
        {
          System.lineSeparator();
        } // trailing comment
        break;
      case "19":
      // comment
      case "20":
      // comment
      case "21":
      default:
        // comment
        break;
    }
  }

  private static void foo1() {
    if (true) {
      switch (1) {
        case 0:

        case 1:

          // odd indentation comment
          int b = 10;
          break;
        default:
          // comment
      }
    }
  }

  /** some javadoc. */
  public void fooDotInCaseBlock() {
    int i = 0;
    String s = "";

    switch (i) {
      case -2:
        // what
        i++;
        break;
      case 0:
        // what
        s.indexOf("ignore");
        break;
      case -1:
        // what

        s.indexOf("no way");
        // odd indentation comment
        break;
      case 1:
      case 2:
        i--;
        break;
      case 3:
        {
        }
      // fall through
      default:
    }

    String breaks =
        ""

            // odd indentation comment
            + "</table>"
            // middle
            + ""
        // end
        ;
  }

  /** some javadoc. */
  public void foo2() {
    int a = 1;
    switch (a) {
      case 1:
      default:
        // odd indentation comment
    }
  }

  /** some javadoc. */
  public void foo3() {
    int a = 1;
    switch (a) {
      case 1:
      default:

        // comment
    }
  }

  /** some javadoc. */
  public void foo4() {
    int a = 1;
    switch (a) {
      case 1:
        int b;
        // odd indentation comment
        break;
      default:
    }
  }

  /** some javadoc. */
  public void foo5() {
    int a = 1;
    switch (a) {
      case 1:
        int b;
        // comment
        break;
      default:
    }
  }

  /** some javadoc. */
  public void foo6() {
    int a = 1;
    switch (a) {
      case 1:
        int b;
        // comment
        break;
      default:
    }
  }

  /** some javadoc. */
  public void foo7() {
    int a = 2;
    String s = "";
    switch (a) {
      // comment
      // comment
      // comment
      case 1:
      case 2:
        // comment
        // comment
        foo1();
        // comment
        break;
      case 3:
      // comment
      // comment
      // comment

      case 4:
      // odd indentation comment
      case 5:
        s.toString().toString().toString();
        // odd indentation comment
        // odd indentation comment
        // odd indentation comment
        break;
      default:
    }
  }

  /** some javadoc. */
  public void foo8() {
    int a = 2;
    String s = "";
    switch (a) {
      // comment
      // comment
      // comment
      case 1:
      case 2:
        // comment
        // comment
        foo1();
        // comment
        break;
      case 3:
        // comment
        // comment
        s.toString().toString().toString();
        // comment

        break;
      case 4:
      // odd indentation comment
      default:
    }
  }

  /** some javadoc. */
  public void foo9() {
    int a = 5;
    switch (a) {
      case 1:
      case 2:
      // comment
      default:
    }
  }

  /** some javadoc. */
  public void foo10() {
    int a = 5;
    switch (a) {
      case 1:
      default:
        // comment
    }
  }

  /** some javadoc. */
  public void foo11() {
    int a = 5;
    switch (a) {
      case 1:
      case 2:
      // comment
      default:
    }
  }

  /** some javadoc. */
  public void foo12() {
    int a = 5;
    switch (a) {
      // comment
      case 1:
      default:
    }
  }
}
