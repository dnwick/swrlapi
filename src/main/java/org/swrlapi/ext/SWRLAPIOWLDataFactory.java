package org.swrlapi.ext;

import java.util.List;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.SWRLRule;
import org.swrlapi.core.OWLIRIResolver;
import org.swrlapi.core.arguments.SWRLBuiltInArgument;
import org.swrlapi.core.arguments.SWRLBuiltInArgumentFactory;
import org.swrlapi.sqwrl.values.SQWRLResultValueFactory;

/**
 * Factory that extends the OWLAPI's {@link OWLDataFactory} class with additional methods to create entities used by the
 * SWRLAPI.
 * <p>
 * It provides a method to create {@link SWRLAPIRule} objects, which extend an OWLAPI {@link SWRLRule}, and provides
 * access to factories to create other entity types used by the SWRLAPI that have no direct equivalent in the OWLAPI.
 * 
 * @see SWRLAPIRule, SWRLAPIOntologyProcessor, SWRLAPIOWLOntology
 */
public interface SWRLAPIOWLDataFactory extends OWLDataFactory
{
	SWRLAPIRule getSWRLRule(String ruleName, String ruleText); // Also SQWRL query

	SWRLBuiltInArgumentFactory getSWRLBuiltInArgumentFactory();

	SWRLAPIBuiltInAtom getSWRLAPIBuiltInAtom(String ruleName, IRI builtInIRI, String builtInShortName,
			List<SWRLBuiltInArgument> arguments);

	SWRLAPIOWLDatatypeFactory getSWRLAPIOWLDatatypeFactory();

	SQWRLResultValueFactory getSQWRLResultValueFactory();

	OWLLiteralFactory getOWLLiteralFactory();

	SWRLAPILiteralFactory getSWRLAPILiteralFactory();

	OWLIRIResolver getOWLIRIResolver();

	// We provide convenience methods for defining these declaration axioms, though we do not specialize the
	// OWLDeclarationAxiom itself.

	OWLDeclarationAxiom getOWLClassDeclarationAxiom(OWLClass individual);

	OWLDeclarationAxiom getOWLIndividualDeclarationAxiom(OWLNamedIndividual individual);

	OWLDeclarationAxiom getOWLObjectPropertyDeclarationAxiom(OWLObjectProperty property);

	OWLDeclarationAxiom getOWLDataPropertyDeclarationAxiom(OWLDataProperty property);

	OWLDeclarationAxiom getOWLAnnotationPropertyDeclarationAxiom(OWLAnnotationProperty property);

	OWLDeclarationAxiom getOWLDatatypeDeclarationAxiom(OWLDatatype datatype);
}
