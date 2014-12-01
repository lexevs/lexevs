# A generic loader script that allows for the selection of a Loader Extension.
#
# Options:
#   -in,--input <uri> URI or path specifying location of the source file
#   -l, --loader <name> LexGrid Load Extension name
#   -mf,--manifest <uri> URI or path specifying location of the manifest file
#   -a, --activate ActivateScheme on successful load; if unspecified the
#         vocabulary is loaded but not activated.
#   -t, --tag <id> An optional tag ID (e.g. 'PRODUCTION' or 'TEST') to assign.
#
# Example: LoadText -in "file:///path/to/file.txt" -a
#
java -Xmx1000m -cp "../runtime/lbPatch.jar:../runtime/lbRuntime.jar" org.LexGrid.LexBIG.admin.Load $@
