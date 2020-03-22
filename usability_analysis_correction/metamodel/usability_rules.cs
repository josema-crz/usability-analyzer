SYNTAXDEF rules
FOR <http://usability_rules/1.0>
START Catalogue


TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
}


TOKENSTYLES {
	"catalogue" COLOR #7F0055, BOLD;
	"name" COLOR #7F0055, BOLD;
	"rule" COLOR #7F0055, BOLD;
	"calculation" COLOR #7F0055, BOLD;
	"restriction" COLOR #7F0055, BOLD;
	"correction" COLOR #7F0055, BOLD;
	"description" COLOR #7F0055, BOLD;	
	"importance" COLOR #7F0055, BOLD;
	"range" COLOR #7F0055, BOLD;
	"elementType" COLOR #7F0055, BOLD;
	"definition" COLOR #7F0055, BOLD;
	"errorMessage" COLOR #7F0055, BOLD;
	"type" COLOR #7F0055, BOLD;
	"min" COLOR #7F0055, BOLD;
	"max" COLOR #7F0055, BOLD;
	"unit" COLOR #7F0055, BOLD;
	"correctValues" COLOR #7F0055, BOLD;
}


RULES {
	Catalogue ::= "catalogue" "{" "name" ":" name['"','"'] (rules)* "}";
	Rule ::= "rule" "{" "name" ":" name['"','"'] "description" "{" description "}" "importance" ":" importance[Low:"Low", Medium:"Medium", High:"High"] "elementType" ":" elementType['"','"'] ("restriction" ":" restriction)? "calculation" ":" calculation "range" "{" range "}" ("correction" ":" correction)? "}";
	EOLCode ::= code['"','"'];
	Description ::= "definition" ":" definition['"','"'] "errorMessage" ":" errorMessage['"','"'];
	DoubleRange ::= "type" ":" "double" "min" ":" min[FLOAT] "max" ":" max[FLOAT] ("unit" ":" unit['"','"'])?;
	BooleanRange ::= "type" ":" "boolean" "correctValue" ":" correctValue[];
	StringRange ::= "type" ":" "string" "correctValues" ":" correctValues['"','"'];
	IntegerRange ::= "type" ":" "integer" "min" ":" min[INTEGER] "max" ":" max[INTEGER] ("unit" ":" unit['"','"'])?;
}