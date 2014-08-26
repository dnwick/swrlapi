package org.swrlapi.core.visitors;

import org.semanticweb.owlapi.model.*;
import org.swrlapi.core.SWRLAPIRule;

/**
 * SWRLAPI OWL axiom visitor customized to deal with {@link org.swrlapi.core.SWRLAPIRule}s instead of
 * OWLAPI-based {@link org.swrlapi.core.SWRLAPIRule}s.
 *
 * @see org.swrlapi.core.SWRLAPIRule
 * @see org.semanticweb.owlapi.model.OWLAxiom
 * @see org.semanticweb.owlapi.model.OWLAxiomVisitor
 */
public interface SWRLAPIOWLAxiomVisitor extends OWLAxiomVisitor
{
	void visit(SWRLAPIRule swrlapiRule);
}
