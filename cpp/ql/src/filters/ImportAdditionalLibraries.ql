/**
 * @name (Import additional libraries)
 * @description This query produces no results but imports some libraries we
 *              would like to make available in the LGTM query console even
 *              if they are not used by any queries.
 * @kind file-classifier
 * @id cpp/lgtm/import-additional-libraries
 */

import cpp

module ASTDataFlow {
  import semmle.code.cpp.dataflow.DataFlow
  import semmle.code.cpp.dataflow.DataFlow2
  import semmle.code.cpp.dataflow.DataFlow3
  import semmle.code.cpp.dataflow.DataFlow4
  import semmle.code.cpp.dataflow.TaintTracking
}

module IRDataFlow {
  import semmle.code.cpp.ir.dataflow.DataFlow
  import semmle.code.cpp.ir.dataflow.DataFlow2
  import semmle.code.cpp.ir.dataflow.DataFlow3
  import semmle.code.cpp.ir.dataflow.DataFlow4
}

import semmle.code.cpp.valuenumbering.HashCons

from File f, string tag
where none()
select f, tag
