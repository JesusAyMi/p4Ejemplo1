package net.iessochoa.jesusayala.p4ejemplo1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import net.iessochoa.jesusayala.p4ejemplo1.databinding.FragmentCambiarNombreBinding
import net.iessochoa.jesusayala.p4ejemplo1.databinding.FragmentSaludoBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CambiarNombreFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CambiarNombreFragment : Fragment() {
    private var _binding: FragmentCambiarNombreBinding? = null
    val args:SaludoFragmentArgs by navArgs()
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCambiarNombreBinding.inflate(inflater, container,
            false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btCambioNombre.setOnClickListener(){
            val nombre=binding.etCambiaNombre.text.toString()
            val action=CambiarNombreFragmentDirections.actionCambiarNombreFragmentToSaludoFragment(nombre)
            findNavController().navigate(action)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}